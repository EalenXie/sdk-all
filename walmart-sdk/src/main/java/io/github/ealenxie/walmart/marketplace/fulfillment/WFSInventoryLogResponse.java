package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/11 15:21
 */
@NoArgsConstructor
@Data
public class WFSInventoryLogResponse {


    /**
     * headers
     */
    @JsonProperty("headers")
    private ResponseHeader headers;
    /**
     * payload
     */
    @JsonProperty("payload")
    private InventoryLogPayload payload;
}
