package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 14:57
 */
@Getter
@Setter
public class ListingQualityCountQueryParams {

    @JsonProperty("viewTrendingItems")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean viewTrendingItems;
    @JsonProperty("wfsFlag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String wfsFlag;
    @JsonProperty("hasIssue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer hasIssue;
    @JsonProperty("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String type;
    @JsonProperty("limit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer limit;
    @JsonProperty("offset")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer offset;
}
