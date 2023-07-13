package io.github.ealenxie.wish.products;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/13 16:27
 */
@Getter
@Setter
public class WarehouseToShippings {
    /**
     * shippingDetails
     */
    @JsonProperty("shipping_details")
    private List<ShippingDetails> shippingDetails;
    /**
     * warehouseId
     */
    @JsonProperty("warehouse_id")
    private String warehouseId;
}
