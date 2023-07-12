package io.github.ealenxie.walmart.marketplace.inventory;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/12 11:10
 * @version 1.0
 */
@Getter
@Setter
public class ShipNode {
    /**
     * modifiedDate
     */
    @JsonProperty("modifiedDate")
    private String modifiedDate;
    /**
     * availToSellQty
     */
    @JsonProperty("availToSellQty")
    private Integer availToSellQty;
    /**
     * onHandQty
     */
    @JsonProperty("onHandQty")
    private Integer onHandQty;
    /**
     * shipNodeType
     */
    @JsonProperty("shipNodeType")
    private String shipNodeType;
}
