package io.github.ealenxie.walmart.marketplace;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/6 13:38
 */
@Getter
@Setter
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
