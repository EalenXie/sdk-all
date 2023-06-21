package io.github.ealenxie.shopify.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Summary {
    @JsonProperty("adjustments_fee_amount")
    private String adjustmentsFeeAmount;
    @JsonProperty("adjustments_gross_amount")
    private String adjustmentsGrossAmount;
    @JsonProperty("charges_fee_amount")
    private String chargesFeeAmount;
    @JsonProperty("charges_gross_amount")
    private String chargesGrossAmount;
    @JsonProperty("refunds_fee_amount")
    private String refundsFeeAmount;
    @JsonProperty("refunds_gross_amount")
    private String refundsGrossAmount;
    @JsonProperty("reserved_funds_fee_amount")
    private String reservedFundsFeeAmount;
    @JsonProperty("reserved_funds_gross_amount")
    private String reservedFundsGrossAmount;
    @JsonProperty("retried_payouts_fee_amount")
    private String retriedPayoutsFeeAmount;
    @JsonProperty("retried_payouts_gross_amount")
    private String retriedPayoutsGrossAmount;
}
