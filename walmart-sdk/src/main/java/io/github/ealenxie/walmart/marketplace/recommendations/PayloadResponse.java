package io.github.ealenxie.walmart.marketplace.recommendations;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 11:24
 */
@NoArgsConstructor
@Data
public class PayloadResponse<T> {

    /**
     * payload
     */
    @JsonProperty("payload")
    private T payload;
}
