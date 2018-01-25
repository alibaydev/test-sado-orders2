package edu;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import edu.sado.*;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;
import okio.Buffer;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import javax.xml.bind.JAXB;
import javax.xml.ws.BindingProvider;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 *
 * @author ibraim
 */
public class Program {

    private static final String DEFAULT_URL = "http://10.20.181.172";
    private static final String DEFAULT_PROFILE = "e57ae039-7339-4ba1-89a8-308771fab6b3";
    private static final String DEFAULT_USERNAME = "ad\\iMinec";
    private static final String DEFAULT_PASSWORD = "!PTGiM2017";

    private static final String FILE_PATH = "./response.txt";

    public static void main(String[] args) {
        try {

            OkHttpClient.Builder httpClient = new OkHttpClient.Builder()
                    .connectTimeout(10, TimeUnit.MINUTES)
                    .writeTimeout(10, TimeUnit.MINUTES)
                    .readTimeout(10, TimeUnit.SECONDS);

            String endpoint = args.length >= 1 ? args[0] : DEFAULT_URL;
            String profile = args.length >= 2 ? args[1] : DEFAULT_PROFILE;
            String username = args.length >= 3 ? args[2] : DEFAULT_USERNAME;
            String password = args.length >= 4 ? args[3] : DEFAULT_PASSWORD;

            Path path = Paths.get(FILE_PATH);

            System.out.println("ENDPOINT: " + endpoint);
            System.out.println("PROFILE ID: " + profile);
            System.out.println("USERNAME: " + username);
            System.out.println("PASSWORD: " + password);

            System.out.println("INIT RETROFIT");

            Gson gson = new GsonBuilder().setLenient().create();

            Retrofit retrofit = new Retrofit.Builder()

                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .client(httpClient.build())
                    .baseUrl(endpoint)
                    .build();

            OrderService orderService = retrofit.create(OrderService.class);

            List<String> params = Arrays.asList("not_executed", "executed", "deps_and_user_ids");

            for (String param: params) {

                final Buffer buffer = new Buffer();
                Request req = orderService.getOrders(param).request();
                req.body().writeTo(buffer);

                System.out.println(req.toString());
                System.out.println("PARAMS: " + buffer.readUtf8());

                System.out.println("HEADERS: " + req.headers());
                Headers headers = req.headers();
                Set<String> headerNames = headers.names();
                for (String header: headerNames) {
                    System.out.println("\t" + header + "=" + headers.get(header));
                }

                System.out.println("POST REQUEST WITH " + param + " PARAM");
                Response<OrdersResponse> response = orderService.getOrders(param).execute();
                System.out.println("RESPONSE RECEIVED");
                System.out.println("MESSAGE: " + response.message());
                System.out.println("CODE: " + response.code());
                //System.out.println("RAW: " + response.raw().toString());
                System.out.println("SUCCESSFULLY: " + response.isSuccessful());

                Files.write(path, param.getBytes());
                Files.write(path, ("MESSAGE: " + response.message()).getBytes());
                Files.write(path, ("CODE: " + response.code()).getBytes());
                Files.write(path, ("RAW: " + response.code()).getBytes());
                Files.write(path, "----------------------------------------------".getBytes());

                if (!response.isSuccessful()) {
                    ResponseBody errorBody = response.errorBody();
                    System.out.println("ERROR BODY: " + errorBody.string());
                    System.out.println("ERROR BODY 2: " + new String(errorBody.bytes()));
                    continue;
                }

                OrdersResponse ordersResponse = response.body();
                 //System.out.println(ordersResponse);

                List<Order> orders = ordersResponse.getOrders();
                if (orders == null) {
                    System.out.println("ORDERS IS NULL");
                    continue;
                }

                List<String> taskId = orders
                        .stream()
                        .map(Order::getResTaskID)
                        .collect(toList());

                System.out.println(taskId);

                System.out.println("TRYING TO LOGIN");

                IntegrationService service = new IntegrationService();
                IntegrationSystemIntegrationService integrationService = service.getBasicHttpBindingIntegrationSystemIntegrationService();

                BindingProvider prov = (BindingProvider) integrationService;
                prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, username);
                prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, password);

                System.out.println("LOGIN SUCCESS");

                for (String id : taskId) {
                    System.out.println("TRYING TO GET TASK " + id);
                    DocumentItem documentItem = integrationService.getTask(profile, id);
                    if (documentItem == null) {
                        System.out.println("TASK NOT FOUND :(");
                        continue;
                    }

                    Communication document = documentItem.getDocument();
                    if (document == null) {
                        System.out.println("TASK NOT FOUND :(");
                        continue;
                    }

                    for (Object object : document.getCitizenRequestOrFilesOrAcknowledgment()) {
                        System.out.println("RECEIVED TASK");
                        if (object instanceof Task) {
                            Task task = (Task) object;

                            System.out.println("NUMBER: " + task.getTaskNumber());
                            System.out.println("TEXT: " + task.getTaskText());
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR");
            e.printStackTrace();
        }

    }
}
