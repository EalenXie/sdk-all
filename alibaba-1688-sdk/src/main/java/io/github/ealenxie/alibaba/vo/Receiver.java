package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月16日 0016 11 36
 */
@Getter
@Setter
public class Receiver {
    /**
     * 收件人名字
     */
    @JsonProperty("receiverName")
    private String receiverName;
    /**
     * 收件人电话
     */
    @JsonProperty("receiverPhone")
    private String receiverPhone;
    /**
     * 收件人电话
     */
    @JsonProperty("receiverMobile")
    private String receiverMobile;
    /**
     * encrypt
     */
    @JsonProperty("encrypt")
    private String encrypt;
    /**
     * 省编码
     */
    @JsonProperty("receiverProvinceCode")
    private String receiverProvinceCode;
    /**
     * 市编码
     */
    @JsonProperty("receiverCityCode")
    private String receiverCityCode;
    /**
     * 国家编码
     */
    @JsonProperty("receiverCountyCode")
    private String receiverCountyCode;
    /**
     * 地址
     */
    @JsonProperty("receiverAddress")
    private String receiverAddress;
    /**
     * 省份
     */
    @JsonProperty("receiverProvince")
    private String receiverProvince;
    /**
     * 城市
     */
    @JsonProperty("receiverCity")
    private String receiverCity;
    /**
     * 国家
     */
    @JsonProperty("receiverCounty")
    private String receiverCounty;
}
