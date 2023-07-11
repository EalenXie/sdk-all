package io.github.ealenxie.walmart.marketplace.onerequestreport;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/10 18:01
 */
@Getter
@Setter
public class DownloadReportResponse {

    /**
     * requestSubmissionDate
     */
    @JsonProperty("requestSubmissionDate")
    private String requestSubmissionDate;
    /**
     * reportType
     */
    @JsonProperty("reportType")
    private String reportType;
    /**
     * requestStatus
     */
    @JsonProperty("requestStatus")
    private String requestStatus;
    /**
     * reportVersion
     */
    @JsonProperty("reportVersion")
    private String reportVersion;
    /**
     * reportGenerationDate
     */
    @JsonProperty("reportGenerationDate")
    private String reportGenerationDate;
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
     * requestId
     */
    @JsonProperty("requestId")
    private String requestId;
}
