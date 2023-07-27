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
public class BusinessIncorporation {
    /**
     * incorporationCountryCode
     */
    @JsonProperty("incorporation_country_code")
    private String incorporationCountryCode;
    /**
     * incorporationDate
     */
    @JsonProperty("incorporation_date")
    private String incorporationDate;
}
