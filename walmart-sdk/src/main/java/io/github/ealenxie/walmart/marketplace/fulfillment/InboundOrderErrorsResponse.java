package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/11 15:26
 */
@NoArgsConstructor
@Data
public class InboundOrderErrorsResponse {

    /**
     * headers
     */
    @JsonProperty("headers")
    private ResponseHeader headers;
    /**
     * payload
     */
    @JsonProperty("payload")
    private List<InboundOrderErrorPayload> payload;
}
