package io.github.ealenxie.paypal.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShopInfoAddress {

    /**
     * 地址的第一行。例如，数字或街道。
     */
    @JsonProperty("line1")
    private String line1;

    /**
     * 地址的第二行。例如，套房或公寓号码。
     */
    @JsonProperty("line2")
    private String line2;

    /**
     * 城市名称。
     */
    @JsonProperty("city")
    private String city;

    /**
     * 标识国家或地区的两字符 ISO 3166-1 代码。
     * https://developer.paypal.com/reference/country-codes/
     */
    @JsonProperty("country_code")
    private String countryCode;

    /**
     * 邮政编码，即邮政编码或等价物。通常需要具有邮政编码或同等邮政编码的国家/地区。
     */
    @JsonProperty("postal_code")
    private String postalCode;
}
