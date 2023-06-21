package io.github.ealenxie.goodcang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/5/23 17:09
 */
@Getter
@Setter
public class TaxInfo {
    /**
     * 可发国家 示例 : GB
     */
    @JsonProperty("exportable_country")
    private String exportableCountry;
    /**
     * 申报品名 示例 : WATERCOLOR PEN
     */
    @JsonProperty("product_declared_name")
    private String productDeclaredName;
    /**
     * 关税计算值
     */
    @JsonProperty("tariff_calculation_value")
    private Double tariffCalculationValue;
    /**
     * 币种
     */
    @JsonProperty("currency")
    private String currency;
    /**
     * 关税百分比
     */
    @JsonProperty("tariff_percentage")
    private Double tariffPercentage;
    /**
     * 附加关税税率
     */
    @JsonProperty("additional_tax_rate")
    private String additionalTaxRate;
    /**
     * VAT税率
     */
    @JsonProperty("vat_tax_rate")
    private Double vatTaxRate;
    /**
     * 海外仓是否可存 示例 : Y
     */
    @JsonProperty("allow_save")
    private String allowSave;
    /**
     * 头程类型 示例 : GC
     */
    @JsonProperty("head_type")
    private String headType;
    /**
     * 申报价值
     */
    @JsonProperty("declared_value")
    private String declaredValue;
}
