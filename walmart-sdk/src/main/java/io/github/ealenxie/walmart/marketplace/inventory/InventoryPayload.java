package io.github.ealenxie.walmart.marketplace.inventory;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.UnitMoney;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/11 11:31
 * @version 1.0
 */
@Getter
@Setter
public class InventoryPayload {

    /**
     * sku
     */
    @JsonProperty("sku")
    private String sku;
    /**
     * quantity
     */
    @JsonProperty("quantity")
    private UnitMoney quantity;
}
