package io.github.ealenxie.walmart.marketplace.feeds;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/6 14:31
 * @version 1.0
 */
@Getter
@Setter
public class FeedResponse {
    /**
     * totalResults
     */
    @JsonProperty("totalResults")
    private Integer totalResults;
    /**
     * offset
     */
    @JsonProperty("offset")
    private Integer offset;
    /**
     * limit
     */
    @JsonProperty("limit")
    private Integer limit;

    /**
     * results
     */
    @JsonProperty("results")
    private Result results;
}
