package io.github.ealenxie.walmart.marketplace.recommendations;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 11:34
 */
@NoArgsConstructor
@Data
public class LimitPayload {
    /**
     * limit
     */
    @JsonProperty("limit")
    private Integer limit;
}
