package io.github.ealenxie.walmart.marketplace;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 15:32
 */
@Getter
@Setter
public class StatusPayloadResponse<T> {
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * payload
     */
    @JsonProperty("payload")
    private T payload;
}
