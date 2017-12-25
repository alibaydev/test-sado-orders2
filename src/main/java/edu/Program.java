package edu;

import edu.sado.*;
import okhttp3.OkHttpClient;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import javax.xml.ws.BindingProvider;
import java.util.Arrays;
import java.util.List;
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

    public static void main(String[] args) {
        try {

            OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

            String endpoint = args.length >= 1 ? args[0] : DEFAULT_URL;
            String profile = args.length >= 2 ? args[1] : DEFAULT_PROFILE;
            String username = args.length >= 3 ? args[2] : DEFAULT_USERNAME;
            String password = args.length >= 4 ? args[3] : DEFAULT_PASSWORD;

            System.out.println("ENDPOINT: " + endpoint);
            System.out.println("PROFILE ID: " + profile);
            System.out.println("USERNAME: " + username);
            System.out.println("PASSWORD: " + password);

            System.out.println("INIT RETROFIT");

            Retrofit retrofit = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClient.build())
                    .baseUrl(endpoint)
                    .build();

            OrderService orderService = retrofit.create(OrderService.class);

            List<String> params = Arrays.asList("not_executed", "executed", "deps_and_user_ids");

            for (String param: params) {

                System.out.println("POST REQUEST WITH " + param + " PARAM");
                Response<OrdersResponse> response = orderService.getOrders(param).execute();
                System.out.println("RESPONSE RECEIVED");

                OrdersResponse ordersResponse = response.body();
                System.out.println(ordersResponse);

                List<String> taskId = ordersResponse.getOrders()
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
