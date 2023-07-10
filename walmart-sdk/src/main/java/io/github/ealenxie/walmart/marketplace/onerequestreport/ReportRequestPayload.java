package io.github.ealenxie.walmart.marketplace.onerequestreport;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/10 17:50
 */
@NoArgsConstructor
@Data
public class ReportRequestPayload {
    /**
     * rowFilters
     */
    @JsonProperty("rowFilters")
    private List<RowFilters> rowFilters;
    /**
     * excludeColumns
     */
    @JsonProperty("excludeColumns")
    private List<String> excludeColumns;
}
