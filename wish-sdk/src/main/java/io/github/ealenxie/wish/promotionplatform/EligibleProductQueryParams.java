package io.github.ealenxie.wish.promotionplatform;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.wish.PageQueryParams;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/13 15:29
 * @version 1.0
 */
@Getter
@Setter
public class EligibleProductQueryParams extends PageQueryParams {
    /**
     * productIds
     */
    @JsonProperty("product_ids")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> productIds;
    /**
     * promotionType
     */
    @JsonProperty("promotion_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String promotionType;
    /**
     * updatedAtMax
     */
    @JsonProperty("updated_at_max")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String updatedAtMax;
    /**
     * updatedAtMin
     */
    @JsonProperty("updated_at_min")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String updatedAtMin;
}
