package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 14:51
 */
@Getter
@Setter
public class ListingQualityScoreQueryParams {
    @JsonProperty("viewTrendingItems")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean viewTrendingItems;
    @JsonProperty("wfsFlag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String wfsFlag;
}
