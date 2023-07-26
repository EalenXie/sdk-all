package io.github.ealenxie.paypal.subscriptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.PageQueryParams;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/18 15:31
 * @version 1.0
 */
@Getter
@Setter
public class PlanQueryParams extends PageQueryParams {
    /**
     * productId
     */
    @JsonProperty("product_id")
    private String productId;
    /**
     * planIds
     */
    @JsonProperty("plan_ids")
    private String planIds;
}
