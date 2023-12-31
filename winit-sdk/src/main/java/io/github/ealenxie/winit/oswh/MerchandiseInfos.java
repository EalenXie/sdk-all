package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/17 11:11
 */
@Getter
@Setter
public class MerchandiseInfos {
    /**
     * sku
     */
    @JsonProperty("SKU")
    private String sku;
    /**
     * eBayItemID
     */
    @JsonProperty("eBayItemID")
    private String eBayItemID;
    /**
     * eBayTransactionID
     */
    @JsonProperty("eBayTransactionID")
    private String eBayTransactionID;
    /**
     * qty
     */
    @JsonProperty("qty")
    private String qty;
    /**
     * specification
     */
    @JsonProperty("specification")
    private String specification;
}
