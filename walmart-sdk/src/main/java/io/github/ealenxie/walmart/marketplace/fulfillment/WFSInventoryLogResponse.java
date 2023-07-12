package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.PageHeader;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/11 15:21
 */
@Getter
@Setter
public class WFSInventoryLogResponse {


    /**
     * headers
     */
    @JsonProperty("headers")
    private PageHeader headers;
    /**
     * payload
     */
    @JsonProperty("payload")
    private InventoryLogPayload payload;
}
