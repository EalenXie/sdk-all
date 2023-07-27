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
public class BusinessNamePayload {
    /**
     * businessName
     */
    @JsonProperty("business_name")
    private String businessName;
    /**
     * type
     */
    @JsonProperty("type")
    private String type;
}
