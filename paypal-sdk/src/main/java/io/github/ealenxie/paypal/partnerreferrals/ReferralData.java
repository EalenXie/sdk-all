package io.github.ealenxie.paypal.partnerreferrals;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/27 9:16
 * @version 1.0
 */
@Setter
@Getter
public class ReferralData {
    /**
     * individualOwners
     */
    @JsonProperty("individual_owners")
    private List<IndividualOwner> individualOwners;
    /**
     * businessEntity
     */
    @JsonProperty("business_entity")
    private BusinessEntity businessEntity;
    /**
     * email
     */
    @JsonProperty("email")
    private String email;
    /**
     * preferredLanguageCode
     */
    @JsonProperty("preferred_language_code")
    private String preferredLanguageCode;
    /**
     * trackingId
     */
    @JsonProperty("tracking_id")
    private String trackingId;
    /**
     * partnerConfigOverride
     */
    @JsonProperty("partner_config_override")
    private PartnerConfigOverride partnerConfigOverride;
    /**
     * operations
     */
    @JsonProperty("operations")
    private List<ReferralOperation> operations;
    /**
     * products
     */
    @JsonProperty("products")
    private List<String> products;
    /**
     * legalConsents
     */
    @JsonProperty("legal_consents")
    private List<LegalConsent> legalConsents;
    /**
     * payoutAttributes
     */
    @JsonProperty("payout_attributes")
    private PayoutAttribute payoutAttributes;
}
