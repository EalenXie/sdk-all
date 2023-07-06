package io.github.ealenxie.walmart.marketplace;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/6 13:58
 * @version 1.0
 */
@Getter
@Setter
public class PageQueryParams {
    /**
     * offset
     */
    @JsonProperty("offset")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String offset;
    /**
     * limit
     */
    @JsonProperty("limit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String limit;
}
