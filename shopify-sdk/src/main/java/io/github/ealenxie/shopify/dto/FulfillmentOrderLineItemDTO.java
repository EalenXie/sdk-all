package io.github.ealenxie.shopify.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie
 * @since 2022/09/27 14:29
 */
@Getter
@Setter
public class FulfillmentOrderLineItemDTO {
    /**
     * id
     */
    private String id;
    /**
     * quantity
     */
    private Integer quantity;
    /**
     * quantity
     */
    private String sku;
}
