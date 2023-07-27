package io.github.ealenxie.paypal.partnerreferrals;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Link;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/27 9:16
 * @version 1.0
 */
@Setter
@Getter
public class ReferralResponse {

    /**
     * partnerReferralId
     */
    @JsonProperty("partner_referral_id")
    private String partnerReferralId;
    /**
     * submitterPayerId
     */
    @JsonProperty("submitter_payer_id")
    private String submitterPayerId;
    /**
     * referralData
     */
    @JsonProperty("referral_data")
    private ReferralData referralData;
    /**
     * links
     */
    @JsonProperty("links")
    private List<Link> links;
}
