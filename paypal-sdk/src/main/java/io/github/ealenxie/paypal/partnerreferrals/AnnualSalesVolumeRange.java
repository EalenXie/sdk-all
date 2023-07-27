package io.github.ealenxie.paypal.partnerreferrals;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/27 9:04
 * @version 1.0
 */
@Getter
@Setter
public class AnnualSalesVolumeRange {
    /**
     * minimumAmount
     */
    @JsonProperty("minimum_amount")
    private Money minimumAmount;
    /**
     * maximumAmount
     */
    @JsonProperty("maximum_amount")
    private Money maximumAmount;
}
