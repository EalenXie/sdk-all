package io.github.ealenxie.walmart.marketplace.items;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/6 15:05
 * @version 1.0
 */
@Getter
@Setter
public class CatalogQueryParams {

    /**
     * page
     */
    @JsonProperty("page")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String page;
    /**
     * limit
     */
    @JsonProperty("limit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String limit;
    /**
     * nextCursor
     */
    @JsonProperty("nextCursor")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String nextCursor;
}
