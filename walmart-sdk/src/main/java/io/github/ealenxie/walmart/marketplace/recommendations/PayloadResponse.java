package io.github.ealenxie.walmart.marketplace.recommendations;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 11:24
 */
@Getter
@Setter
public class PayloadResponse<T> {

    /**
     * payload
     */
    @JsonProperty("payload")
    private T payload;
}
