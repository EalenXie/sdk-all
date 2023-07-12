package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.PageHeader;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/11 15:24
 */
@Getter
@Setter
public class InboundShipmentItemsResponse {

    /**
     * headers
     */
    @JsonProperty("headers")
    private PageHeader headers;
    /**
     * payload
     */
    @JsonProperty("payload")
    private List<InboundShipmentItemPayload> payload;
}
