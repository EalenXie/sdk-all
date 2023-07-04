package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author create by sch  2023/1/28 15:37
 * @version 1.0
 */
@Getter
@Setter
public class CustomsDeclaration {
    /**
     * 国家
     */
    @JsonProperty("countryCode")
    private String countryCode;
    /**
     * 申报品名
     */
    @JsonProperty("declareName")
    private String declareName;
    /**
     * 进口申报价值(美元)
     */
    @JsonProperty("importPrice")
    private BigDecimal importPrice;
    /**
     * 出口申报价值(美元)
     */
    @JsonProperty("exportPrice")
    private BigDecimal exportPrice;
    /**
     * 退税率
     */
    @JsonProperty("rebateRate")
    private BigDecimal rebateRate;
    /**
     * 进口关税税率
     */
    @JsonProperty("importRate")
    private BigDecimal importRate;
    /**
     * 头程类型,商品支持的入库类型
     * NL-无限制
     * NS-卖家直发
     */
    @JsonProperty("firstWayType")
    private String firstWayType;
    /**
     * 增值税率
     */
    @JsonProperty("vatRate")
    private BigDecimal vatRate;
    /**
     * 核实长度(厘米)
     */
    @JsonProperty("length")
    private BigDecimal length;
    /**
     * 核实宽度(厘米)
     */
    @JsonProperty("width")
    private BigDecimal width;
    /**
     * 核实高度(厘米)
     */
    @JsonProperty("height")
    private BigDecimal height;
    /**
     * 核实体积(m3)
     */
    @JsonProperty("volume")
    private BigDecimal volume;
    /**
     * 核实重量(Kg)
     */
    @JsonProperty("weight")
    private BigDecimal weight;
    /**
     * 注册重量(Kg)
     */
    @JsonProperty("registerWeight")
    private BigDecimal registerWeight;
    /**
     * 注册长度(厘米)
     */
    @JsonProperty("registerLength")
    private BigDecimal registerLength;
    /**
     * 注册宽度(厘米)
     */
    @JsonProperty("registerWidth")
    private BigDecimal registerWidth;
    /**
     * 注册高度(厘米)
     */
    @JsonProperty("registerHeight")
    private BigDecimal registerHeight;
    /**
     * 注册体积(立方米)
     */
    @JsonProperty("registerVolume")
    private BigDecimal registerVolume;
    /**
     * 建议申报价值
     */
    @JsonProperty("recommendDeclarePrice")
    private BigDecimal recommendDeclarePrice;
    /**
     * 是否新品
     */
    @JsonProperty("isNew")
    private String isNew;
    /**
     * 货型规格
     */
    @JsonProperty("cargoTypeSpec")
    private String cargoTypeSpec;
    /**
     * 数量
     */
    @JsonProperty("qty")
    private Integer qty;
    /**
     * 商品是否禁止入库
     * Y：禁止入库
     * N：不禁止入库
     */
    @JsonProperty("isProhibitWarehousing")
    private String isProhibitWarehousing;
    @JsonProperty("needEar")
    private String needEar;
    @JsonProperty("needInstructions")
    private String needInstructions;
    @JsonProperty("needInstructionsUrl")
    private String needInstructionsUrl;
}
