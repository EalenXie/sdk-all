package io.github.ealenxie.walmart.marketplace.inventory;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.UnitMoney;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/11 13:43
 * @version 1.0
 */
@Getter
@Setter
public class InventoryNode {
    /**
     * shipNode
     */
    @JsonProperty("shipNode")
    private String shipNode;
    /**
     * inputQty
     */
    @JsonProperty("inputQty")
    private UnitMoney inputQty;
    /**
     * availToSellQty
     */
    @JsonProperty("availToSellQty")
    private UnitMoney availToSellQty;
    /**
     * reservedQty
     */
    @JsonProperty("reservedQty")
    private UnitMoney reservedQty;
}
