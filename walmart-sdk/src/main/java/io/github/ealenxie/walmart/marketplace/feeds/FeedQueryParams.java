package io.github.ealenxie.walmart.marketplace.feeds;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.PageQueryParams;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/6 14:01
 * @version 1.0
 */
@Getter
@Setter
public class FeedQueryParams extends PageQueryParams {

    /**
     * feedId
     */
    @JsonProperty("feedId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String feedId;
}
