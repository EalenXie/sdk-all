package io.github.ealenxie.walmart.marketplace.recommendations;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 11:35
 */
@NoArgsConstructor
@Data
public class RecordsMeta {
    /**
     * totalRecords
     */
    @JsonProperty("totalRecords")
    private Integer totalRecords;
    /**
     * recordsFetched
     */
    @JsonProperty("recordsFetched")
    private Integer recordsFetched;
    /**
     * limit
     */
    @JsonProperty("limit")
    private Integer limit;
    /**
     * nextCursor
     */
    @JsonProperty("nextCursor")
    private String nextCursor;
}
