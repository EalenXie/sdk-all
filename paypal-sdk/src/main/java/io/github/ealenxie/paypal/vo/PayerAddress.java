package io.github.ealenxie.paypal.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 获取流水接口返回数据
 * 买家信息（payer_info）中的买家地址（address）
 * <p>
 * By Ashe
 */
@Getter
@Setter
public class PayerAddress {

    /**
     * 地址一
     */
    @JsonProperty("line1")
    private String line1;

    /**
     * 地址二
     */
    @JsonProperty("line2")
    private String line2;

    /**
     * 城市
     */
    @JsonProperty("city")
    private String city;

    /**
     * 省州
     */
    @JsonProperty("state")
    private String state;

    /**
     * 国家二字码
     */
    @JsonProperty("country_code")
    private String countryCode;

    /**
     * 邮政编码
     */
    @JsonProperty("postal_code")
    private String postalCode;
}
