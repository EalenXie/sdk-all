package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/10 13:37
 */
@NoArgsConstructor
@Data
public class FetchOrderOffer {
    /**
     * sku
     */
    @JsonProperty("sku")
    private String sku;
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
     * requestedQuantity
     */
    @JsonProperty("requestedQuantity")
    private Qty requestedQuantity;
}
