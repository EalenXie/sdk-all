package io.github.ealenxie.walmart.marketplace.recommendations;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 12:14
 */
@Getter
@Setter
public class RecommendationDownloadPayload {


    /**
     * recommendationType
     */
    @JsonProperty("recommendationType")
    private String recommendationType;
    /**
     * filterCriteria
     */
    @JsonProperty("filterCriteria")
    private FilterCriteria filterCriteria;
}
