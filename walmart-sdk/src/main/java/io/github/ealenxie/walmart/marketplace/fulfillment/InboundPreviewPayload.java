package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/10 14:22
 */
@NoArgsConstructor
@Data
public class InboundPreviewPayload {
    /**
     * inboundOrderId
     */
    @JsonProperty("inboundOrderId")
    private String inboundOrderId;
    /**
     * returnAddress
     */
    @JsonProperty("returnAddress")
    private ReturnAddress returnAddress;
    /**
     * orderItems
     */
    @JsonProperty("orderItems")
    private List<PreviewOrderItem> orderItems;
}
