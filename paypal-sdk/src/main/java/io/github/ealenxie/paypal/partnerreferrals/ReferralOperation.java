package io.github.ealenxie.paypal.partnerreferrals;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/27 9:16
 * @version 1.0
 */
@Getter
@Setter
public class ReferralOperation {
    /**
     * operation
     */
    @JsonProperty("operation")
    private String operation;
    /**
     * apiIntegrationPreference
     */
    @JsonProperty("api_integration_preference")
    private ApiIntegrationPreference apiIntegrationPreference;
    /**
     * billingAgreement
     */
    @JsonProperty("billing_agreement")
    private BillingAgreement billingAgreement;
}
