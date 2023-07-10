package io.github.ealenxie.walmart.marketplace.onerequestreport;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/10 17:52
 */
@Getter
@Setter
public class GenerateReportRequestParams {
    @JsonProperty("reportType")
    private String reportType;
    @JsonProperty("reportVersion")
    private String reportVersion;
}
