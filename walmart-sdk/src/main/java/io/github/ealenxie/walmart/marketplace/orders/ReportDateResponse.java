package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/2/17 17:32
 * @version 1.0
 */
@Getter
@Setter
public class ReportDateResponse {
    @JsonProperty("availableApReportDates")
    private List<String> reportDates;
}
