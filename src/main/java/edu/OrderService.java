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
    @POST("/report/GetRawData.asmx")
    Call<OrdersResponse> getOrders(@Field("data") String mode);
}
