package io.github.ealenxie.walmart.marketplace.reports;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/2/9 9:29
 * @version 1.0
 */
@Getter
@Setter
public class ReportQueryParams extends ReportVersionQueryParams {
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String reportDate;

}
