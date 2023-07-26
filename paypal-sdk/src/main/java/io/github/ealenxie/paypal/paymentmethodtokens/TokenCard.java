package io.github.ealenxie.paypal.paymentmethodtokens;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/26 16:44
 * @version 1.0
 */
@Getter
@Setter
public class TokenCard {
    /**
     * number
     */
    @JsonProperty("number")
    private String number;
    /**
     * expiry
     */
    @JsonProperty("expiry")
    private String expiry;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * billingAddress
     */
    @JsonProperty("billing_address")
    private BillingAddress billingAddress;
    /**
     * experienceContext
     */
    @JsonProperty("experience_context")
    private ExperienceContext experienceContext;
}
