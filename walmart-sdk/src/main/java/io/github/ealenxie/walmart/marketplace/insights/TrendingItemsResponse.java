package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 14:44
 */
@NoArgsConstructor
@Data
public class TrendingItemsResponse {
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * payload
     */
    @JsonProperty("payload")
    private TrendingItemPayload payload;
}
