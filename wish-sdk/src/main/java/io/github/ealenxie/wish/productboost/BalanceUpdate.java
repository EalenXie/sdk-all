package io.github.ealenxie.wish.productboost;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.wish.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/13 15:31
 */
@Getter
@Setter
public class BalanceUpdate {
    /**
     * amount
     */
    @JsonProperty("amount")
    private Money amount;
    /**
     * createdAt
     */
    @JsonProperty("created_at")
    private String createdAt;
    /**
     * type
     */
    @JsonProperty("type")
    private String type;
    /**
     * chargeReason
     */
    @JsonProperty("charge_reason")
    private String chargeReason;
    /**
     * campaignId
     */
    @JsonProperty("campaign_id")
    private String campaignId;
}
