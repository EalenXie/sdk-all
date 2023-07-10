package io.github.ealenxie.walmart.marketplace.onerequestreport;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/10 17:48
 */
@Getter
@Setter
public class ReportRequestsQueryParams {
    @JsonProperty("reportType")
    private String reportType;
    @JsonProperty("reportVersion")
    private String reportVersion;
    @JsonProperty("requestStatus")
    private String requestStatus;
    @JsonProperty("requestSubmissionStartDate")
    private String requestSubmissionStartDate;
    @JsonProperty("requestSubmissionEndDate")
    private String requestSubmissionEndDate;

}
