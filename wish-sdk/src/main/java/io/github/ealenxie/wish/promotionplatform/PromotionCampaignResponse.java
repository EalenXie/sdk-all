package io.github.ealenxie.wish.promotionplatform;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/13 15:41
 * @version 1.0
 */
@Getter
@Setter
public class PromotionCampaignResponse {

    /**
     * unqualifiedProductVariations
     */
    @JsonProperty("unqualified_product_variations")
    private List<UnqualifiedProductVariations> unqualifiedProductVariations;
    /**
     * cancelReason
     */
    @JsonProperty("cancel_reason")
    private String cancelReason;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * cancelComment
     */
    @JsonProperty("cancel_comment")
    private String cancelComment;
    /**
     * countries
     */
    @JsonProperty("countries")
    private List<String> countries;
    /**
     * createdAt
     */
    @JsonProperty("created_at")
    private String createdAt;
    /**
     * variationsDiscountData
     */
    @JsonProperty("variations_discount_data")
    private List<VariationsDiscount> variationsDiscountData;
    /**
     * endAt
     */
    @JsonProperty("end_at")
    private String endAt;
    /**
     * state
     */
    @JsonProperty("state")
    private String state;
    /**
     * cancelAt
     */
    @JsonProperty("cancel_at")
    private String cancelAt;
    /**
     * promotionType
     */
    @JsonProperty("promotion_type")
    private String promotionType;
    /**
     * startAt
     */
    @JsonProperty("start_at")
    private String startAt;
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
}
