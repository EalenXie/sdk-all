package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/7 14:45
 */
@NoArgsConstructor
@Data
public class TrendingItemPayload {
    /**
     * items
     */
    @JsonProperty("items")
    private List<TrendingItem> items;
    /**
     * totalCount
     */
    @JsonProperty("totalCount")
    private Integer totalCount;
}
