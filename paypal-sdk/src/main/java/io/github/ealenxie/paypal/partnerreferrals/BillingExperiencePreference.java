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
public class BillingExperiencePreference {
    /**
     * experienceId
     */
    @JsonProperty("experience_id")
    private String experienceId;
    /**
     * billingContextSet
     */
    @JsonProperty("billing_context_set")
    private Boolean billingContextSet;
}
