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
public class ClassicApiIntegration {
    /**
     * integrationType
     */
    @JsonProperty("integration_type")
    private String integrationType;
    /**
     * thirdPartyDetails
     */
    @JsonProperty("third_party_details")
    private ThirdPartyDetail thirdPartyDetails;
    /**
     * firstPartyDetails
     */
    @JsonProperty("first_party_details")
    private String firstPartyDetails;
}
