package io.github.ealenxie.walmart.marketplace.inventory;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/12 10:54
 * @version 1.0
 */
@Getter
@Setter
public class UpdateBulkInventoryQueryParams {
    /**
     * feedType
     */
    @JsonProperty("feedType")
    private String feedType;
    /**
     * shipNode
     */
    @JsonProperty("shipNode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String shipNode;
}
