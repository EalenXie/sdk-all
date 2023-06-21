package io.github.ealenxie.allegro.vo.checkoutform;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 14:39
 */
@Getter
@Setter
public class InvoiceAddress {
    /**
     * 街道
     */
    @JsonProperty("street")
    private String street;
    /**
     * 城市
     */
    @JsonProperty("city")
    private String city;
    /**
     * 邮政编码
     */
    @JsonProperty("zipCode")
    private String zipCode;
    /**
     * 国家代码
     */
    @JsonProperty("countryCode")
    private String countryCode;
    /**
     * 公司信息
     */
    @JsonProperty("company")
    private Company company;
    /**
     * 收款人信息
     */
    @JsonProperty("naturalPerson")
    private Buyer naturalPerson;
}
