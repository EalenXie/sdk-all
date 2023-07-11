package io.github.ealenxie.walmart.marketplace.inventory;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.UnitMoney;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author create by sch  2023/7/11 17:47
 * @version 1.0
 */
@Setter
@Getter
public class UpdateInventoryNode {
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
}
