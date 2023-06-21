package io.github.ealenxie.armlogi.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/4/23 10:59
 * @version 1.0
 */
@Getter
@Setter
public class CreateOrderDTO {

    /**
     * 城市
     */
    @JsonProperty("city")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String city;
    /**
     * 国家简码
     */
    @JsonProperty("countryCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String countryCode;
    /**
     * 门牌号
     */
    @JsonProperty("doorplate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String doorplate;
    /**
     * 电子邮件
     */
    @JsonProperty("email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String email;
    /**
     * 是否装箱 1:是 0:否
     */
    @JsonProperty("isBox")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer isBox;
    /**
     * 是否打托 0 否 1是
     */
    @JsonProperty("isTray")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer isTray;
    /**
     * 证件号
     */
    @JsonProperty("license")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String license;
    /**
     * 电话
     */
    @JsonProperty("mobilePhone")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String mobilePhone;
    /**
     * 邮编(校验邮编正确性)
     */
    @JsonProperty("oabPostcode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String oabPostcode;
    /**
     * 备注
     */
    @JsonProperty("ordRemarks")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String ordRemarks;
    /**
     * 类型：0:普通 ;1:重发,4补发单
     */
    @JsonProperty("orderType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer orderType;
    /**
     * 平台代码
     */
    @JsonProperty("platform")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String platform;
    /**
     * 平台店铺代码
     */
    @JsonProperty("platformShop")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String platformShop;
    /**
     * 物流产品Code
     */
    @JsonProperty("postCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String postCode;
    /**
     * 收件人姓名
     */
    @JsonProperty("receiveName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String receiveName;
    /**
     * 参考编号
     */
    @JsonProperty("referenceNo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String referenceNo;
    /**
     * 销售组
     */
    @JsonProperty("saleGroup")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String saleGroup;
    /**
     * 是否购买签名服务 1:是 0:否
     */
    @JsonProperty("signature")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer signature;
    /**
     * 省/州/区域
     */
    @JsonProperty("state")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String state;
    /**
     * 地址1
     */
    @JsonProperty("streetAddress1")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String streetAddress1;
    /**
     * 地址2
     */
    @JsonProperty("streetAddress2")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String streetAddress2;
    /**
     * 跟踪号
     */
    @JsonProperty("trackingNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String trackingNumber;
    /**
     * 贴托盘标签 0 否 1 是
     */
    @JsonProperty("trayLable")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer trayLable;
    /**
     * 托盘数
     */
    @JsonProperty("trayNum")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer trayNum;
    /**
     * 托盘类型 ：1双向，2四向
     */
    @JsonProperty("trayType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer trayType;
    /**
     * 仓库code
     */
    @JsonProperty("warehouseCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String warehouseCode;
    /**
     * 文件
     */
    @JsonProperty("attacheds")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Attached> attacheds;
    /**
     * products
     */
    @JsonProperty("products")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Product> products;
}
