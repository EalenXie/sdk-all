package io.github.ealenxie.paypal.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShippingInfo {

    /**
     * 收件人的姓名。
     */
    @JsonProperty("name")
    private String name;
    /**
     * 与此订单相关联的运输方法。
     */
    private String method;

    /**
     * 与此订单关联的送货地址。
     */
    @JsonProperty("address")
    private ShopInfoAddress address;

    @JsonProperty("secondary_shipping_address")
    private ShopInfoAddress secondaryShippingAddress;
}
