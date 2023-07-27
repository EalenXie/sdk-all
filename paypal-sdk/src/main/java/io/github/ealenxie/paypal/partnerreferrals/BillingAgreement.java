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
public class BillingAgreement {
    /**
     * description
     */
    @JsonProperty("description")
    private String description;
    /**
     * billingExperiencePreference
     */
    @JsonProperty("billing_experience_preference")
    private BillingExperiencePreference billingExperiencePreference;
    /**
     * merchantCustomData
     */
    @JsonProperty("merchant_custom_data")
    private String merchantCustomData;
    /**
     * approvalUrl
     */
    @JsonProperty("approval_url")
    private String approvalUrl;
    /**
     * ecToken
     */
    @JsonProperty("ec_token")
    private String ecToken;
}
