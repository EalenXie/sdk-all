package io.github.ealenxie.walmart.marketplace.recommendations;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 12:28
 */
@NoArgsConstructor
@Data
public class DownloadUrlPayload {

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
     * downloadURL
     */
    @JsonProperty("downloadURL")
    private String downloadURL;
    /**
     * downloadURLExpirationTime
     */
    @JsonProperty("downloadURLExpirationTime")
    private String downloadURLExpirationTime;
    /**
     * requestVersion
     */
    @JsonProperty("requestVersion")
    private String requestVersion;
}
