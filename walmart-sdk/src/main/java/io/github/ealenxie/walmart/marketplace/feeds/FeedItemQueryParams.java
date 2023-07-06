package io.github.ealenxie.walmart.marketplace.feeds;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.PageQueryParams;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/6 14:29
 * @version 1.0
 */
@Getter
@Setter
public class FeedItemQueryParams extends PageQueryParams {
    /**
     * includeDetails
     */
    @JsonProperty("includeDetails")
    private String includeDetails;
}
