package io.github.ealenxie.eccang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author jadechiang
 * @since 2022/12/27 8:55
 */
@Getter
@Setter
public class DetailVO {

    /**
     * 文档未写字段
     */
    @JsonProperty("pop_id")
    private String popId;
    /**
     * 文档未写字段
     */
    @JsonProperty("contract_price")
    private BigDecimal contractPrice;

    /**
     * 文档未写字段
     */
    @JsonProperty("payable_amount")
    private BigDecimal payableAmount;

    /**
     * 产品Id
     */
    @JsonProperty("product_id")
    private Integer productId;

    /**
     * 预期数量
     */
    @JsonProperty("qty_expected")
    private Integer qtyExpected;

    /**
     * (良品上架数量)付款数量
     */
    @JsonProperty("qty_pay")
    private Integer qtyPay;


    /**
     * 交期确认数量
     */
    @JsonProperty("qty_eta")
    private Integer qtyEta;

    /**
     * 实收数量
     */
    @JsonProperty("qty_receving")
    private Integer qtyReceving;

    /**
     * 赠送数量
     */
    @JsonProperty("qty_free")
    private Integer qtyFree;

    /**
     * 单价
     */
    @JsonProperty("unit_price")
    private BigDecimal unitPrice;


    /**
     * 总价
     */
    @JsonProperty("total_price")
    private BigDecimal totalPrice;

    /**
     * 币种
     */
    @JsonProperty("currency_code")
    private String currencyCode;
    /**
     * 产品代码
     */
    @JsonProperty("product_sku")
    private String productSku;

    /**
     * 产品名称(URLEncode后的)
     */
    @JsonProperty("product_title")
    private String productTitle;

    /**
     * 供应商品号
     */
    @JsonProperty("sp_supplier_sku")
    private String spSupplierSku;
    /**
     * 是否赠品0否，1是
     */
    @JsonProperty("is_free")
    private String isFree;

    /**
     * 产品采购备注
     */
    @JsonProperty("note")
    private String note;

    /**
     * 外部单号
     */
    @JsonProperty("pop_external_number")
    private String popExternalNumber;

    /**
     * 头程占用数量
     */
    @JsonProperty("transfer_qty")
    private String transferQty;

    /**
     * 税率
     */
    @JsonProperty("po_tax_rate")
    private BigDecimal poTaxRate;

    /**
     * 首次到货时间
     */
    @JsonProperty("first_receive_time")
    private String firstReceiveTime;

    /**
     * 平台产品代码：如1688产品ID beta
     */
    @JsonProperty("pop_platform_product")
    private String popPlatformProduct;

    /**
     * 平台产品款式：如1688产品的specId beta
     */
    @JsonProperty("pop_platform_sku")
    private String popPlatformSku;

    /**
     * 产品采购状态
     */
    @JsonProperty("po_status")
    private String poStatus;


}
