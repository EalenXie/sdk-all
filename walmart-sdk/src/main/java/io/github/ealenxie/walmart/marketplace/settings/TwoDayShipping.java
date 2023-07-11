package io.github.ealenxie.walmart.marketplace.settings;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/11 11:32
 */
@Getter
@Setter
public class TwoDayShipping {
    /**
     * carrierMethodName
     */
    @JsonProperty("carrierMethodName")
    private String carrierMethodName;
    /**
     * carrierMethodType
     */
    @JsonProperty("carrierMethodType")
    private String carrierMethodType;
}
