package io.github.ealenxie.walmart.marketplace.feeds;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/6 14:34
 * @version 1.0
 */
@Getter
@Setter
public class FeedItemPayload {

    /**
     * feedId
     */
    @JsonProperty("feedId")
    private String feedId;
    /**
     * feedStatus
     */
    @JsonProperty("feedStatus")
    private String feedStatus;
    /**
     * feedSubmissionDate
     */
    @JsonProperty("feedSubmissionDate")
    private Long feedSubmissionDate;
    /**
     * itemsReceived
     */
    @JsonProperty("itemsReceived")
    private Integer itemsReceived;
    /**
     * itemsSucceeded
     */
    @JsonProperty("itemsSucceeded")
    private Integer itemsSucceeded;
    /**
     * itemsFailed
     */
    @JsonProperty("itemsFailed")
    private Integer itemsFailed;
    /**
     * itemsProcessing
     */
    @JsonProperty("itemsProcessing")
    private Integer itemsProcessing;
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
     * itemDetails
     */
    @JsonProperty("itemDetails")
    private ItemDetail itemDetails;
}
