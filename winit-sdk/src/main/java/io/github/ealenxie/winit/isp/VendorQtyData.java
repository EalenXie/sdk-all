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
     * 数量
     */
    @JsonProperty("quantity")
    private Integer quantity;
    /**
     * 供应商编码
     */
    @JsonProperty("vendorCode")
    private String vendorCode;
}
