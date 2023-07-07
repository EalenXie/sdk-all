package io.github.ealenxie.walmart.marketplace.prices;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.PageQueryParams;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/7 17:06
 * @version 1.0
 */
@Getter
@Setter
public class IncentiveQueryParams extends PageQueryParams {
    /**
     * sortBy
     */
    @JsonProperty("sortBy")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sortBy;
    /**
     * sortOrder
     */
    @JsonProperty("sortOrder")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sortOrder;
}
