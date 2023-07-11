package io.github.ealenxie.walmart.marketplace.inventory;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/11 13:41
 * @version 1.0
 */
@Getter
@Setter
public class ShipNodeQueryParams {
    /**
     * shipNode
     */
    @JsonProperty("shipNode")
    private String shipNode;
}
