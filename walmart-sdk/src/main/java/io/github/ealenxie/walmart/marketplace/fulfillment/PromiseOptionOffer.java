package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.Qty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/10 13:41
 */
@Getter
@Setter
public class PromiseOptionOffer {
    /**
     * availableQuantity
     */
    @JsonProperty("availableQuantity")
    private Qty availableQuantity;
    /**
     * requestedQuantity
     */
    @JsonProperty("requestedQuantity")
    private Qty requestedQuantity;
    /**
     * lineId
     */
    @JsonProperty("lineId")
    private String lineId;
    /**
     * salesUnit
     */
    @JsonProperty("salesUnit")
    private String salesUnit;
    /**
     * sku
     */
    @JsonProperty("sku")
    private String sku;

}
