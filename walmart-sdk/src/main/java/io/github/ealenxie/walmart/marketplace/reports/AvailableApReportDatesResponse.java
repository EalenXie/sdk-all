package io.github.ealenxie.walmart.marketplace.reports;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/7 10:08
 */
@NoArgsConstructor
@Data
public class AvailableApReportDatesResponse {


    /**
     * availableApReportDates
     */
    @JsonProperty("availableApReportDates")
    private List<String> availableApReportDates;
}
