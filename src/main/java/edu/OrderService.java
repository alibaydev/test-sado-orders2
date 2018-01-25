package edu;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * @author ibraim
 */
public interface OrderService {

    @FormUrlEncoded
    @POST("/report/GetRawData.asmx/GetData")
    Call<OrdersResponse> getOrders(@Field("data") String mode);
}

//curl -d "data=not_executed" -H "Content-Type: application/x-www-form-urlencoded" -X POST http://10.20.181.172/report/GetRawData.asmx/GetData -o response.txt
