package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/10 14:01
 */
@NoArgsConstructor
@Data
public class InboundShipmentsResponse {
    /**
     * headers
     */
    @JsonProperty("headers")
    private PageHeader headers;
    /**
     * payload
     */
    @JsonProperty("payload")
    private List<InboundShipmentPayload> payload;
}
