package io.github.ealenxie.alibaba.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2022/12/16 9:07
 */
@Getter
@Setter
public class InvoiceParam {
    /**
     * 发票类型 0：普通发票，1:增值税发票
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("invoiceType")
    private Integer invoiceType;
    /**
     * 省份文本
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("provinceText")
    private String provinceText;
    /**
     * 城市文本
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("cityText")
    private String cityText;
    /**
     * 地区文本
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
     * 邮编
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("postCode")
    private String postCode;
    /**
     * 街道
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("address")
    private String address;
    /**
     * 收票人姓名
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("fullName")
    private String fullName;
    /**
     * 电话
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("phone")
    private String phone;
    /**
     * 手机
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("mobile")
    private String mobile;
    /**
     * 购货公司名（发票抬头）
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("companyName")
    private String companyName;
    /**
     * 纳税识别码
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("taxpayerIdentifier")
    private String taxpayerIdentifier;
    /**
     * 开户行及帐号
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("bankAndAccount")
    private String bankAndAccount;
    /**
     * 增值税本地发票号
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("localInvoiceId")
    private String localInvoiceId;


}
