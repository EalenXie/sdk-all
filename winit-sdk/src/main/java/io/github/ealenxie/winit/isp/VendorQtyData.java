package io.github.ealenxie.winit.isp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/14 17:01
 */
@Getter
@Setter
public class VendorQtyData {

    /**
     * quantity
     */
    @JsonProperty("quantity")
    private Integer quantity;
    /**
     * vendorCode
     */
    @JsonProperty("vendorCode")
    private String vendorCode;
}
