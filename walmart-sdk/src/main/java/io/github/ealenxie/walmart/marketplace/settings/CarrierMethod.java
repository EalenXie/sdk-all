package io.github.ealenxie.walmart.marketplace.settings;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/11 14:33
 */
@Getter
@Setter
public class CarrierMethod {


    /**
     * carrierMethodId
     */
    @JsonProperty("carrierMethodId")
    private String carrierMethodId;
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
    /**
     * carrierMethodDescription
     */
    @JsonProperty("carrierMethodDescription")
    private String carrierMethodDescription;
}
