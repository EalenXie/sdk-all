package io.github.ealenxie.walmart.marketplace;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/6 13:38
 */
@NoArgsConstructor
@Data
public class Meta {
    /**
     * totalCount
     */
    @JsonProperty("totalCount")
    private Integer totalCount;
    /**
     * limit
     */
    @JsonProperty("limit")
    private Integer limit;
    /**
     * nextCursor
     */
    @JsonProperty("nextCursor")
    private String nextCursor;
}
