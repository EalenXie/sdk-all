package io.github.ealenxie.walmart.marketplace.recommendations;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/7 11:22
 */
@Getter
@Setter
public class RecommendationsRejectFilterPayload {

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
    /**
     * rejectionCodes
     */
    @JsonProperty("rejectionCodes")
    private List<String> rejectionCodes;
    /**
     * customRejectionMessage
     */
    @JsonProperty("customRejectionMessage")
    private String customRejectionMessage;

}
