package io.github.ealenxie.wish.productboost;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.wish.Money;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/13 14:33
 */
@Getter
@Setter
public class CampaignResponse {

    /**
     * isAutomatedCampaign
     */
    @JsonProperty("is_automated_campaign")
    private Boolean isAutomatedCampaign;
    /**
     * autoRenew
     */
    @JsonProperty("auto_renew")
    private Boolean autoRenew;
    /**
     * totalImpressions
     */
    @JsonProperty("total_impressions")
    private Integer totalImpressions;
    /**
     * pbSales
     */
    @JsonProperty("pb_sales")
    private Integer pbSales;
    /**
     * sales
     */
    @JsonProperty("sales")
    private Integer sales;
    /**
     * campaignName
     */
    @JsonProperty("campaign_name")
    private String campaignName;
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * discountRatio
     */
    @JsonProperty("discount_ratio")
    private Integer discountRatio;
    /**
     * totalCampaignSpend
     */
    @JsonProperty("total_campaign_spend")
    private Money totalCampaignSpend;
    /**
     * merchantBudget
     */
    @JsonProperty("merchant_budget")
    private Money merchantBudget;
    /**
     * bonusBudgetSpend
     */
    @JsonProperty("bonus_budget_spend")
    private Money bonusBudgetSpend;
    /**
     * scheduledAddBudgetDays
     */
    @JsonProperty("scheduled_add_budget_days")
    private List<Integer> scheduledAddBudgetDays;
    /**
     * paidImpressions
     */
    @JsonProperty("paid_impressions")
    private Integer paidImpressions;
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
     * type
     */
    @JsonProperty("type")
    private String type;
    /**
     * gmv
     */
    @JsonProperty("gmv")
    private Money gmv;
    /**
     * intenseBoost
     */
    @JsonProperty("intense_boost")
    private Boolean intenseBoost;
    /**
     * scheduledAddBudgetAmount
     */
    @JsonProperty("scheduled_add_budget_amount")
    private Money scheduledAddBudgetAmount;
    /**
     * startAt
     */
    @JsonProperty("start_at")
    private String startAt;
    /**
     * pbImpressions
     */
    @JsonProperty("pb_impressions")
    private Integer pbImpressions;
    /**
     * bonusBudget
     */
    @JsonProperty("bonus_budget")
    private Money bonusBudget;
    /**
     * updatedAt
     */
    @JsonProperty("updated_at")
    private String updatedAt;
    /**
     * pbClicks
     */
    @JsonProperty("pb_clicks")
    private Integer pbClicks;
    /**
     * merchantId
     */
    @JsonProperty("merchant_id")
    private String merchantId;
    /**
     * minSpend
     */
    @JsonProperty("min_spend")
    private Money minSpend;
    /**
     * totalImpressionFeesCharged
     */
    @JsonProperty("total_impression_fees_charged")
    private Money totalImpressionFeesCharged;
    /**
     * impressionFeesBreakdowns
     */
    @JsonProperty("impression_fees_breakdowns")
    private List<ImpressionFeesBreakdowns> impressionFeesBreakdowns;
    /**
     * maxBudget
     */
    @JsonProperty("max_budget")
    private Money maxBudget;
    /**
     * products
     */
    @JsonProperty("products")
    private List<CampaignProduct> products;
    /**
     * totalEnrollmentFees
     */
    @JsonProperty("total_enrollment_fees")
    private Money totalEnrollmentFees;
    /**
     * pbGmv
     */
    @JsonProperty("pb_gmv")
    private Money pbGmv;
}
