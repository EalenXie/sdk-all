package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/17 14:30
 */
@Getter
@Setter
public class VendorInfo {

    /**
     * isWinit
     */
    @JsonProperty("isWinit")
    private String isWinit;
    /**
     * vendorName
     */
    @JsonProperty("vendorName")
    private String vendorName;
    /**
     * vendorCode
     */
    @JsonProperty("vendorCode")
    private String vendorCode;
}
