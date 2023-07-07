package io.github.ealenxie.walmart.marketplace.recommendations;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 12:25
 */
@Getter
@Setter
public class FileOnRequestStatus {

    /**
     * requestId
     */
    @JsonProperty("requestId")
    private String requestId;
    /**
     * recommendationType
     */
    @JsonProperty("recommendationType")
    private String recommendationType;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * submissionDate
     */
    @JsonProperty("submissionDate")
    private String submissionDate;
    /**
     * totalNoOfRecords
     */
    @JsonProperty("totalNoOfRecords")
    private Integer totalNoOfRecords;
    /**
     * requestVersion
     */
    @JsonProperty("requestVersion")
    private String requestVersion;
}
