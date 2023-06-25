package io.github.ealenxie.goodcang.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/25 13:14
 */
@Getter
@Setter
public class CalculateDeliveryFeePayload {

    /**
     * 仓库代码
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    /**
     * 物流产品代码
     */
    @JsonProperty("sm_code")
    private String smCode;
    /**
     * 目的国家/地区代码
     */
    @JsonProperty("country_code")
    private String countryCode;
    /**
     * 邮政编码
     */
    @JsonProperty("postcode")
    private String postcode;
    /**
     * 包裹重量
     */
    @JsonProperty("weight")
    private Integer weight;
    /**
     * 包裹长
     */
    @JsonProperty("length")
    private Integer length;
    /**
     * 包裹宽
     */
    @JsonProperty("width")
    private Integer width;
    /**
     * 包裹高
     */
    @JsonProperty("height")
    private Integer height;
    /**
     * 商品编码
     * [商品编码与包裹重量必须填写一个,商品编码与包裹重量都填写时,以商品编码为主] 格式如:["sku1","sku2:1","sku3:1"],多个商品隔开,冒号后接商品数量,不填商品数量,默认1件,最多不超过100种sku
     */
    @JsonProperty("sku")
    private List<String> sku;
    /**
     * 是否住宅地址
     */
    @JsonProperty("is_residential")
    private Integer isResidential;
    /**
     * 是否签名服务
     */
    @JsonProperty("is_sign_server")
    private Integer isSignServer;
    /**
     * 是否保险服务
     */
    @JsonProperty("is_insurance_service")
    private Integer isInsuranceService;
    /**
     * 保险金额
     * 单位USD 当is_insurance_service等于2时生效
     */
    @JsonProperty("insurance_amount")
    private Integer insuranceAmount;
    /**
     * 省/州
     */
    @JsonProperty("state")
    private String state;
    /**
     * 城市
     */
    @JsonProperty("city")
    private String city;
    /**
     * 平台模式
     */
    @JsonProperty("property_label")
    private String propertyLabel;
}
