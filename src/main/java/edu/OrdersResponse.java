package edu;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author ibraim
 */
@Data
public class OrdersResponse implements Serializable {

    @SerializedName("Table")
    private List<Order> orders;
}
