package io.github.ealenxie.allegro.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/6/30 15:42
 * @version 1.0
 */

@Getter
@Setter
public class UpdateAdvanceShipNoticePayload {
    /**
     * items
     */
    @JsonProperty("items")
    private List<Item> items;
    /**
     * handlingUnit
     */
    @JsonProperty("handlingUnit")
    private HandlingUnit handlingUnit;
    /**
     * shipping
     */
    @JsonProperty("shipping")
    private Shipping shipping;
}
