package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.Qty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/10 13:41
 */
@Getter
@Setter
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
