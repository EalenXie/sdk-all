package io.github.ealenxie.eccang.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author jadechiang
 * @since 2022/12/23 16:11
 */
@Getter
@Setter
public class ProductListDTO {

    /**
     * 产品代码
     */
    @JsonProperty("product_sku")
    private String productSku;


    /**
     * 产品数量
     */
    @JsonProperty("qty_expected")
    private Integer qtyExpected;

    /**
     * 币种
     */
    @JsonProperty("currency_code")
    private String currencyCode;

    /**
     * 不含税单价 该值需大于0，is_free字段传1后，该值会默认为0，但传值仍需大于0
     */
    @JsonProperty("unit_price")
    private BigDecimal unitPrice;

    /**
     * 含税单价
     */
    @JsonProperty("contract_price")
    private BigDecimal contractPrice;

    /**
     * 采购参考价
     */
    @JsonProperty("sp_reference_unit_price")
    private BigDecimal spReferenceUnitPrice;

    /**
     * 是否质检 是（1）否（0）
     */
    @JsonProperty("is_qc")
    private Integer isQc;

    /**
     * 是否赠品，1为赠品
     */
    @JsonProperty("is_free")
    private Integer isFree;

    /**
     * 赠品数量
     */
    @JsonProperty("qty_free")
    private String qtyFree;

    /**
     * 税率
     */
    @JsonProperty("po_tax_rate")
    private BigDecimal poTaxRate;

    /**
     * 外部单号
     */
    @JsonProperty("pop_external_number")
    private String popExternalNumber;

    /**
     * 备注
     */
    @JsonProperty("note")
    private String note;

    /**
     * 下单原因
     */
    @JsonProperty("reason")
    private String reason;


}
