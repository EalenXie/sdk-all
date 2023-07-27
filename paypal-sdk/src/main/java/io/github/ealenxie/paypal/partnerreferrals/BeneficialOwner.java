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
public class BeneficialOwner {
    /**
     * individualBeneficialOwners
     */
    @JsonProperty("individual_beneficial_owners")
    private List<IndividualBeneficialOwner> individualBeneficialOwners;
    /**
     * businessBeneficialOwners
     */
    @JsonProperty("business_beneficial_owners")
    private List<BusinessBeneficialOwner> businessBeneficialOwners;
}
