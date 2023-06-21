package io.github.ealenxie.paypal.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/11/28 15:07
 */
@Getter
@Setter
public class PaymentInstruction {

    @JsonProperty("disbursement_mode")
    private String disbursementMode;
    @JsonProperty("payee_pricing_tier_id")
    private String payeePricingTierId;
    @JsonProperty("payee_receivable_fx_rate_id")
    private String payeeReceivableFxRateId;
    @JsonProperty("platform_fees")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<PlatformFee> platformFees;
}
