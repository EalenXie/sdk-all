package io.github.ealenxie.wish.productboost;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.wish.Money;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/13 14:33
 */
@NoArgsConstructor
@Data
public class CampaignProduct {
    /**
     * merchantBidRate
     */
    @JsonProperty("merchant_bid_rate")
    private Money merchantBidRate;
    /**
     * productId
     */
    @JsonProperty("product_id")
    private String productId;
    /**
     * isMaxboost
     */
    @JsonProperty("is_maxboost")
    private Boolean isMaxboost;
    /**
     * paidImpressions
     */
    @JsonProperty("paid_impressions")
    private Integer paidImpressions;
    /**
     * keywords
     */
    @JsonProperty("keywords")
    private List<String> keywords;
    /**
     * enrollmentFee
     */
    @JsonProperty("enrollment_fee")
    private Money enrollmentFee;
    /**
     * actualChargeRate
     */
    @JsonProperty("actual_charge_rate")
    private Money actualChargeRate;
}
