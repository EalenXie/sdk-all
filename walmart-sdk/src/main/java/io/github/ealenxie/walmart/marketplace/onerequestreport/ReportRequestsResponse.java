package io.github.ealenxie.walmart.marketplace.onerequestreport;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/10 17:49
 */
@Getter
@Setter
public class ReportRequestsResponse {

    /**
     * page
     */
    @JsonProperty("page")
    private Integer page;
    /**
     * totalCount
     */
    @JsonProperty("totalCount")
    private Integer totalCount;
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
    /**
     * requests
     */
    @JsonProperty("requests")
    private List<ReportRequest> requests;
}
