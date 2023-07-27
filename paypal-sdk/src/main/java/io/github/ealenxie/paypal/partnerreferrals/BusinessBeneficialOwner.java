package io.github.ealenxie.paypal.partnerreferrals;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/27 9:04
 * @version 1.0
 */
@Getter
@Setter
public class BusinessBeneficialOwner {
    /**
     * businessType
     */
    @JsonProperty("business_type")
    private BusinessType businessType;
    /**
     * businessIndustry
     */
    @JsonProperty("business_industry")
    private BusinessIndustry businessIndustry;
    /**
     * businessIncorporation
     */
    @JsonProperty("business_incorporation")
    private BusinessIncorporation businessIncorporation;
    /**
     * names
     */
    @JsonProperty("names")
    private List<BusinessNamePayload> names;
    /**
     * emails
     */
    @JsonProperty("emails")
    private List<EmailPayload> emails;
    /**
     * website
     */
    @JsonProperty("website")
    private String website;
    /**
     * addresses
     */
    @JsonProperty("addresses")
    private List<AddressPayload> addresses;
    /**
     * phones
     */
    @JsonProperty("phones")
    private List<PhonePayload> phones;
    /**
     * percentageOfOwnership
     */
    @JsonProperty("percentage_of_ownership")
    private String percentageOfOwnership;
}
