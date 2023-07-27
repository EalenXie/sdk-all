package io.github.ealenxie.paypal.partnerreferrals;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/27 9:04
 * @version 1.0
 */
@Getter
@Setter
public class PartnerConfigOverride {
    /**
     * partnerLogoUrl
     */
    @JsonProperty("partner_logo_url")
    private String partnerLogoUrl;
    /**
     * returnUrl
     */
    @JsonProperty("return_url")
    private String returnUrl;
    /**
     * returnUrlDescription
     */
    @JsonProperty("return_url_description")
    private String returnUrlDescription;
    /**
     * actionRenewalUrl
     */
    @JsonProperty("action_renewal_url")
    private String actionRenewalUrl;
    /**
     * showAddCreditCard
     */
    @JsonProperty("show_add_credit_card")
    private Boolean showAddCreditCard;
}
