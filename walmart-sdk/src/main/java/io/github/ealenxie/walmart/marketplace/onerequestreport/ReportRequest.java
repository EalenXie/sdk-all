package io.github.ealenxie.walmart.marketplace.onerequestreport;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/10 17:50
 */
@Getter
@Setter
public class ReportRequest {
    /**
     * requestId
     */
    @JsonProperty("requestId")
    private String requestId;
    /**
     * requestStatus
     */
    @JsonProperty("requestStatus")
    private String requestStatus;
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
     * reportVersion
     */
    @JsonProperty("reportVersion")
    private String reportVersion;
    /**
     * payload
     */
    @JsonProperty("payload")
    private ReportRequestPayload payload;
}
