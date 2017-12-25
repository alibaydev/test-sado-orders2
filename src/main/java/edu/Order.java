package edu;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author ibraim
 */
@Data
public class Order implements Serializable {

    private String resTaskID;

    @SerializedName("PlanExecTime")
    private String planExecTime;

    private String rcRegDate;

    private String rcID;

    @SerializedName("Executor")
    private String executor;
}
