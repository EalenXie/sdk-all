package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/10 13:19
 */
@NoArgsConstructor
@Data
public class RequestIdPayload {
    /**
     * requestId
     */
    @JsonProperty("requestId")
    private String requestId;
}
