package io.github.ealenxie.walmart.marketplace.reports;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 10:05
 */
@Getter
@Setter
public class ReportVersionQueryParams {
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String reportVersion;
}
