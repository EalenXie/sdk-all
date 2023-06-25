package io.github.ealenxie.goodcang.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/25 13:23
 */
@Getter
@Setter
public class VerifyAddressInfoPayload {
    /**
     * 地址信息
     */
    @JsonProperty("address")
    private OabAddress address;
    /**
     * 配送方式
     */
    @JsonProperty("shipping_method")
    private String shippingMethod;
}
