package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/10 13:41
 */
@NoArgsConstructor
@Data
public class LineItemAttribute {
    /**
     * availableQuantity
     */
    @JsonProperty("availableQuantity")
    private Qty availableQuantity;
    /**
     * fulfillmentChannel
     */
    @JsonProperty("fulfillmentChannel")
    private List<String> fulfillmentChannel;
    /**
     * lineId
     */
    @JsonProperty("lineId")
    private String lineId;
}
