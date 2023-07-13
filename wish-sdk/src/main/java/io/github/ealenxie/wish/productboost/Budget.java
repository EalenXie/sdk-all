package io.github.ealenxie.wish.productboost;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.wish.Money;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/13 15:11
 */
@NoArgsConstructor
@Data
public class Budget {


    /**
     * productBoostBonus
     */
    @JsonProperty("product_boost_bonus")
    private Money productBoostBonus;
    /**
     * productBoostCredit
     */
    @JsonProperty("product_boost_credit")
    private Money productBoostCredit;
    /**
     * totalAvailableBudget
     */
    @JsonProperty("total_available_budget")
    private Money totalAvailableBudget;
    /**
     * merchantAccountBalance
     */
    @JsonProperty("merchant_account_balance")
    private Money merchantAccountBalance;
    /**
     * productBoostBalance
     */
    @JsonProperty("product_boost_balance")
    private Money productBoostBalance;
    /**
     * productBoostLoan
     */
    @JsonProperty("product_boost_loan")
    private Money productBoostLoan;
    /**
     * productBoostUnpaidBalance
     */
    @JsonProperty("product_boost_unpaid_balance")
    private Money productBoostUnpaidBalance;
}
