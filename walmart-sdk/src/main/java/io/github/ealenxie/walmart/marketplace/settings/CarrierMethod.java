package io.github.ealenxie.walmart.marketplace.settings;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/11 14:33
 */
@NoArgsConstructor
@Data
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
