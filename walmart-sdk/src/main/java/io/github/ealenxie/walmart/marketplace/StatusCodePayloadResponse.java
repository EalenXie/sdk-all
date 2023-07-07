package io.github.ealenxie.walmart.marketplace;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 15:32
 */
@Getter
@Setter
public class StatusCodePayloadResponse<T> {
    /**
     * statusCode
     */
    @JsonProperty("statusCode")
    private Integer statusCode;
    /**
     * payload
     */
    @JsonProperty("payload")
    private T payload;
}
