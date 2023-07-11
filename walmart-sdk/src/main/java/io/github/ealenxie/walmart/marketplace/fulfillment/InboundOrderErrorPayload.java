package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/11 15:27
 */
@NoArgsConstructor
@Data
public class InboundOrderErrorPayload {
    /**
     * inboundOrderId
     */
    @JsonProperty("inboundOrderId")
    private String inboundOrderId;
    /**
     * createdDate
     */
    @JsonProperty("createdDate")
    private String createdDate;
    /**
     * returnAddress
     */
    @JsonProperty("returnAddress")
    private ReturnAddress returnAddress;
    /**
     * orderItems
     */
    @JsonProperty("orderItems")
    private List<InboundOrderOrderItem> orderItems;
    /**
     * errors
     */
    @JsonProperty("errors")
    private List<Error> errors;
}
