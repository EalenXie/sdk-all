package io.github.ealenxie.alibaba.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2022/12/16 9:06
 */
@Getter
@Setter
public class AddressParam {
    /**
     * 收货地址id
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("addressId")
    private Long addressId;
    /**
     * 收货人姓名
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("fullName")
    private String fullName;
    /**
     * 手机
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("mobile")
    private String mobile;
    /**
     * 电话
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("phone")
    private String phone;
    /**
     * 邮编
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("postCode")
    private String postCode;
    /**
     * 市文本
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("cityText")
    private String cityText;
    /**
     * 省份文本
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("provinceText")
    private String provinceText;
    /**
     * 区文本
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("areaText")
    private String areaText;
    /**
     * 镇文本
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("townText")
    private String townText;
    /**
     * 街道地址
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("address")
    private String address;
    /**
     * 地址编码
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("districtCode")
    private String districtCode;

}
