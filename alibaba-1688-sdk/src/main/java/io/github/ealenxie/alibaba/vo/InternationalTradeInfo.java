package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhs
 * @since 2022年12月16日 0016 09 45
 */
@Getter
@Setter
public class InternationalTradeInfo {

    /**
     * FOB价格货币，参见FAQ 货币枚举值
     */
    @JsonProperty("fobCurrency")
    private String fobCurrency;
    /**
     * FOB最小价格
     */
    @JsonProperty("fobMinPrice")
    private String fobMinPrice;
    /**
     * FOB最大价格
     */
    @JsonProperty("fobMaxPrice")
    private String fobMaxPrice;
    /**
     * FOB计量单位，参见FAQ 计量单位枚举值
     */
    @JsonProperty("fobUnitType")
    private String fobUnitType;
    /**
     * 付款方式，参见FAQ 付款方式枚举值
     */
    @JsonProperty("paymentMethods")
    private List<String> paymentMethods;
    /**
     * 最小起订量
     */
    @JsonProperty("minOrderQuantity")
    private Integer minOrderQuantity;
    /**
     * 最小起订量计量单位，参见FAQ 计量单位枚举值
     */
    @JsonProperty("minOrderUnitType")
    private String minOrderUnitType;
    /**
     * supplyQuantity
     */
    @JsonProperty("supplyQuantity")
    private Integer supplyQuantity;
    /**
     * 供货能力计量单位，参见FAQ 计量单位枚举值
     */
    @JsonProperty("supplyUnitType")
    private String supplyUnitType;
    /**
     * 供货能力周期，参见FAQ 时间周期枚举值
     */
    @JsonProperty("supplyPeriodType")
    private String supplyPeriodType;
    /**
     * 发货港口
     */
    @JsonProperty("deliveryPort")
    private String deliveryPort;
    /**
     * 发货期限
     */
    @JsonProperty("deliveryTime")
    private String deliveryTime;
    /**
     * 新发货期限
     */
    @JsonProperty("consignmentDate")
    private Integer consignmentDate;
    /**
     * 常规包装
     */
    @JsonProperty("packagingDesc")
    private String packagingDesc;
}
