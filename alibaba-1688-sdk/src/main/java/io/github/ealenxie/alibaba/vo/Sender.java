package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月16日 0016 11 33
 */
@Getter
@Setter
public class Sender {
    /**
     * 发件人姓名
     */
    @JsonProperty("senderName")
    private String senderName;
    /**
     * 发件人电话
     */
    @JsonProperty("senderPhone")
    private String senderPhone;
    /**
     * 发件人电话
     */
    @JsonProperty("senderMobile")
    private String senderMobile;
    /**
     * encrypt
     */
    @JsonProperty("encrypt")
    private String encrypt;
    /**
     * 省编码
     */
    @JsonProperty("senderProvinceCode")
    private String senderProvinceCode;
    /**
     * 城市编码
     */
    @JsonProperty("senderCityCode")
    private String senderCityCode;
    /**
     * 国家编码
     */
    @JsonProperty("senderCountyCode")
    private String senderCountyCode;
    /**
     * 发货人地址
     */
    @JsonProperty("senderAddress")
    private String senderAddress;
    /**
     * 省份
     */
    @JsonProperty("senderProvince")
    private String senderProvince;
    /**
     * 城市
     */
    @JsonProperty("senderCity")
    private String senderCity;
    /**
     * 国家
     */
    @JsonProperty("senderCounty")
    private String senderCounty;
}
