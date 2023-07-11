package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/10 13:19
 */
@Getter
@Setter
public class RequestIdPayload {
    /**
     * requestId
     */
    @JsonProperty("requestId")
    private String requestId;
}
