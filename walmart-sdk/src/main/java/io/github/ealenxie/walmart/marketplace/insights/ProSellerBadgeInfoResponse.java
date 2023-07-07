package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 14:14
 */
@Getter
@Setter
public class ProSellerBadgeInfoResponse {

    /**
     * hasBadge
     */
    @JsonProperty("hasBadge")
    private Boolean hasBadge;
    /**
     * isEligible
     */
    @JsonProperty("isEligible")
    private Boolean isEligible;
    /**
     * badgedSince
     */
    @JsonProperty("badgedSince")
    private String badgedSince;
    /**
     * isProhibited
     */
    @JsonProperty("isProhibited")
    private Boolean isProhibited;
    /**
     * badgeStatus
     */
    @JsonProperty("badgeStatus")
    private String badgeStatus;
    /**
     * meetsCriteria
     */
    @JsonProperty("meetsCriteria")
    private MeetsCriteria meetsCriteria;
    /**
     * criteriaData
     */
    @JsonProperty("criteriaData")
    private CriteriaData criteriaData;
    /**
     * recommendations
     */
    @JsonProperty("recommendations")
    private Recommendations recommendations;
}
