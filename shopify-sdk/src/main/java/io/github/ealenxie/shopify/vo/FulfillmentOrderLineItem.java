package io.github.ealenxie.shopify.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/9/27 16:58
 */
@Getter
@Setter
public class FulfillmentOrderLineItem {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("shop_id")
    private Long shopId;
    @JsonProperty("fulfillment_order_id")
    private Long fulfillmentOrderId;
    @JsonProperty("quantity")
    private Integer quantity;
    @JsonProperty("line_item_id")
    private Long lineItemId;
    @JsonProperty("inventory_item_id")
    private Long inventoryItemId;
    @JsonProperty("fulfillable_quantity")
    private Integer fulfillableQuantity;
    @JsonProperty("variant_id")
    private Long variantId;
}
