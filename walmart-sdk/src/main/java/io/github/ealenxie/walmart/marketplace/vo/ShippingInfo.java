package io.github.ealenxie.walmart.marketplace.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie
 * @since 2022/08/04 12:38
 */
@Getter
@Setter
public class ShippingInfo {
    @JsonProperty("postalAddress")
    private PostalAddress postalAddress;
    /**
     * 手机号
     */
    @JsonProperty("phone")
    private String phone;
    /**
     * 预计发货日期
     */
    @JsonProperty("estimatedShipDate")
    private Long estimatedShipDate;
    /**
     * 预计交货日期
     */
    @JsonProperty("estimatedDeliveryDate")
    private Long estimatedDeliveryDate;
    /**
     * 运输方式 Standard、Express、OneDay、Freight、WhiteGlove、Value
     */
    @JsonProperty("methodCode")
    private String methodCode;
}
