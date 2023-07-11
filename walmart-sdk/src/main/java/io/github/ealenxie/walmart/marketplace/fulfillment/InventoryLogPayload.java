package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/11 15:21
 */
@NoArgsConstructor
@Data
public class InventoryLogPayload {
    /**
     * gtin
     */
    @JsonProperty("gtin")
    private String gtin;
    /**
     * vendorSku
     */
    @JsonProperty("vendorSku")
    private String vendorSku;
    /**
     * productName
     */
    @JsonProperty("productName")
    private String productName;
    /**
     * inventoryLog
     */
    @JsonProperty("inventoryLog")
    private List<InventoryLog> inventoryLog;
}
