package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/17 14:29
 */
@Getter
@Setter
public class VendorInfoGetData {

    /**
     * countryCode
     */
    @JsonProperty("countryCode")
    private String countryCode;
    /**
     * vendorType
     */
    @JsonProperty("vendorType")
    private String vendorType;
}
