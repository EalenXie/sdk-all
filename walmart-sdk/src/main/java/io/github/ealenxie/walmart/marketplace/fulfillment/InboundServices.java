package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/10 14:06
 */
@NoArgsConstructor
@Data
public class InboundServices {
    /**
     * inventoryTransferService
     */
    @JsonProperty("inventoryTransferService")
    private String inventoryTransferService;
}
