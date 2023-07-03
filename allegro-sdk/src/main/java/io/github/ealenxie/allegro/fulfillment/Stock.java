package io.github.ealenxie.allegro.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/3 9:48
 * @version 1.0
 */
@Setter
@Getter
public class Stock {
    /**
     * product
     */
    @JsonProperty("product")
    private Products product;
    /**
     * quantity
     */
    @JsonProperty("quantity")
    private Quantity quantity;
    /**
     * sellingStats
     */
    @JsonProperty("sellingStats")
    private SellingStats sellingStats;
    /**
     * reserve
     */
    @JsonProperty("reserve")
    private Reserve reserve;
    /**
     * storageFee
     */
    @JsonProperty("storageFee")
    private StorageFee storageFee;
}
