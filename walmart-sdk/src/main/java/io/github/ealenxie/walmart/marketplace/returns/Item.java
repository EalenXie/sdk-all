package io.github.ealenxie.walmart.marketplace.returns;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.Qty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/11 10:10
 * @version 1.0
 */
@Getter
@Setter
public class Item {
    /**
     * sku
     */
    @JsonProperty("sku")
    private String sku;
    /**
     * productName
     */
    @JsonProperty("productName")
    private String productName;
    /**
     * itemWeight
     */
    @JsonProperty("itemWeight")
    private Qty itemWeight;
}
