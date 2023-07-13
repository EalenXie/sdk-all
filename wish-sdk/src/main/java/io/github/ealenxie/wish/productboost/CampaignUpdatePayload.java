package io.github.ealenxie.wish.productboost;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.wish.Money;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/13 14:31
 */
@Getter
@Setter
public class CampaignUpdatePayload {


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
     * autoRenew
     */
    @JsonProperty("auto_renew")
    private Boolean autoRenew;
    /**
     * merchantBudget
     */
    @JsonProperty("merchant_budget")
    private Money merchantBudget;
    /**
     * scheduledAddBudgetDays
     */
    @JsonProperty("scheduled_add_budget_days")
    private List<Integer> scheduledAddBudgetDays;
    /**
     * endAt
     */
    @JsonProperty("end_at")
    private String endAt;
    /**
     * maxBudget
     *
     * @deprecated deprecated by wish
     */
    @JsonProperty("max_budget")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Deprecated
    private Money maxBudget;
    @JsonProperty("state")
    private String state;
    /**
     * products
     */
    @JsonProperty("products")
    private List<ProductKeywords> products;
    /**
     * campaignName
     */
    @JsonProperty("campaign_name")
    private String campaignName;
    /**
     * intenseBoost
     */
    @JsonProperty("intense_boost")
    private Boolean intenseBoost;
}
