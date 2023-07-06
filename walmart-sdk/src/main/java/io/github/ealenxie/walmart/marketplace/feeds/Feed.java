package io.github.ealenxie.walmart.marketplace.feeds;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/6 14:06
 * @version 1.0
 */
@Getter
@Setter
public class Feed {
    /**
     * feedId
     */
    @JsonProperty("feedId")
    private String feedId;
    /**
     * feedSource
     */
    @JsonProperty("feedSource")
    private String feedSource;
    /**
     * feedType
     */
    @JsonProperty("feedType")
    private String feedType;
    /**
     * partnerId
     */
    @JsonProperty("partnerId")
    private String partnerId;
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
     * feedStatus
     */
    @JsonProperty("feedStatus")
    private String feedStatus;
    /**
     * feedDate
     */
    @JsonProperty("feedDate")
    private Long feedDate;
    /**
     * modifiedDtm
     */
    @JsonProperty("modifiedDtm")
    private Long modifiedDtm;
    /**
     * fileName
     */
    @JsonProperty("fileName")
    private String fileName;
    /**
     * itemDataErrorCount
     */
    @JsonProperty("itemDataErrorCount")
    private Integer itemDataErrorCount;
    /**
     * itemSystemErrorCount
     */
    @JsonProperty("itemSystemErrorCount")
    private Integer itemSystemErrorCount;
    /**
     * itemTimeoutErrorCount
     */
    @JsonProperty("itemTimeoutErrorCount")
    private Integer itemTimeoutErrorCount;
    /**
     * channelType
     */
    @JsonProperty("channelType")
    private String channelType;
    /**
     * orgId
     */
    @JsonProperty("orgId")
    private String orgId;
    /**
     * shipNode
     */
    @JsonProperty("shipNode")
    private String shipNode;
}
