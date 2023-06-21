package io.github.ealenxie.cne.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * CNE交运发件人信息
 */
@Getter
@Setter
public class ReturnAddress {
    /**
     * 姓名
     */
    @JsonProperty("name")
    private String name;
    /**
     * 地址
     */
    @JsonProperty("addr")
    private String addr;
    /**
     * 城市
     */
    @JsonProperty("city")
    private String city;
    /**
     * 邮编
     */
    @JsonProperty("postcode")
    private String postcode;
    /**
     * 省州
     */
    @JsonProperty("province")
    private String province;
    /**
     * 国家
     */
    @JsonProperty("country")
    private String country;
}
