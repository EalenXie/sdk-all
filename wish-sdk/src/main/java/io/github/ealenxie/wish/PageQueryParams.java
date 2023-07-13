package io.github.ealenxie.wish;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/13 10:02
 * @version 1.0
 */
@Getter
@Setter
public class PageQueryParams {
    /**
     * limit
     */
    @JsonProperty("limit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer limit;
    /**
     * sortBy
     */
    @JsonProperty("sort_by")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sortBy;
}
