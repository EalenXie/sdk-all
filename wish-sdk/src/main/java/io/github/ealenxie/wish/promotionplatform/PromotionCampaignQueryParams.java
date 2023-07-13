package io.github.ealenxie.wish.promotionplatform;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.wish.PageQueryParams;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/13 16:18
 * @version 1.0
 */
@Getter
@Setter
public class PromotionCampaignQueryParams extends PageQueryParams {
    /**
     * createdAtMax
     */
    @JsonProperty("created_at_max")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String createdAtMax;
    /**
     * createdAtMin
     */
    @JsonProperty("created_at_min")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String createdAtMin;
    /**
     * endAtMax
     */
    @JsonProperty("end_at_max")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String endAtMax;
    /**
     * endAtMin
     */
    @JsonProperty("end_at_min")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String endAtMin;
    /**
     * name
     */
    @JsonProperty("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String name;
    /**
     * productId
     */
    @JsonProperty("product_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String productId;
    /**
     * promotionTypes
     */
    @JsonProperty("promotion_types")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> promotionTypes;
    /**
     * states
     */
    @JsonProperty("states")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> states;
    /**
     * startAtMax
     */
    @JsonProperty("start_at_max")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String startAtMax;
    /**
     * startAtMin
     */
    @JsonProperty("start_at_min")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String startAtMin;
}
