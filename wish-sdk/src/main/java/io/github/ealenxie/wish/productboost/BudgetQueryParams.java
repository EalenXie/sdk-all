package io.github.ealenxie.wish.productboost;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/13 15:09
 */
@Getter
@Setter
public class BudgetQueryParams {
    @JsonProperty("campaign_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String campaignId;

}
