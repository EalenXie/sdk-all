package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/11 15:10
 */
@Getter
@Setter
public class FulfillmentOrdersStatusResponse {


    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * header
     */
    @JsonProperty("header")
    private Header header;
    /**
     * payload
     */
    @JsonProperty("payload")
    private List<FulfillmentOrderPayload> payload;
}
