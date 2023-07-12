package io.github.ealenxie.wish.bulkproducts;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/12 13:17
 */
@NoArgsConstructor
@Data
public class WarehouseToShippings {
    /**
     * shippingDetails
     */
    @JsonProperty("shipping_details")
    private List<ShippingDetail> shippingDetails;
    /**
     * warehouseId
     */
    @JsonProperty("warehouse_id")
    private String warehouseId;
}
