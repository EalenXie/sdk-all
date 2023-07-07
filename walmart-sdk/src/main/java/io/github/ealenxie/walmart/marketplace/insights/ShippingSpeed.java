package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 13:20
 */
@Getter
@Setter
public class ShippingSpeed {
    /**
     * score
     */
    @JsonProperty("score")
    private Integer score;
    /**
     * issueDesc
     */
    @JsonProperty("issueDesc")
    private String issueDesc;
    /**
     * issueTitle
     */
    @JsonProperty("issueTitle")
    private String issueTitle;
    /**
     * shippingType
     */
    @JsonProperty("shippingType")
    private String shippingType;
}
