package io.github.ealenxie.paypal.disputes;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/18 14:03
 */
@Getter
@Setter
public class UpdateDisputePayload {

    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * createTime
     */
    @JsonProperty("create_time")
    private String createTime;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
}
