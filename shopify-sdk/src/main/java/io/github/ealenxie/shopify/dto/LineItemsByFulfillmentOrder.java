package io.github.ealenxie.shopify.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie
 * @since 2022/09/27 14:29
 */
@Getter
@Setter
public class LineItemsByFulfillmentOrder {
    /**
     * fulfillmentOrderId
     */
    @JsonProperty("fulfillment_order_id")
    private String fulfillmentOrderId;
    /**
     * fulfillmentOrderLineItems
     */
    @JsonProperty("fulfillment_order_line_items")
    private List<FulfillmentOrderLineItemDTO> fulfillmentOrderLineItems;
}
