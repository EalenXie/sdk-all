package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/11 15:26
 */
@Getter
@Setter
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
