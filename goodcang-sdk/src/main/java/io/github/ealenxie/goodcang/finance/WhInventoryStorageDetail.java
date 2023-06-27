package io.github.ealenxie.goodcang.finance;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/27 11:32
 */
@Getter
@Setter
public class WhInventoryStorageDetail {

    /**
     * 单号
     */
    @JsonProperty("wis_code")
    private String wisCode;
    /**
     * 产品代码
     */
    @JsonProperty("product_barcode")
    private String productBarcode;
    /**
     * 产品名称
     */
    @JsonProperty("product_name")
    private String productName;
    /**
     * 参考编号
     */
    @JsonProperty("reference_no")
    private String referenceNo;
    /**
     * 计费时间
     */
    @JsonProperty("charge_date")
    private String chargeDate;
    /**
     * 上架时间
     */
    @JsonProperty("putaway_date")
    private String putawayDate;
    /**
     * 长
     */
    @JsonProperty("length")
    private Double length;
    /**
     * 宽
     */
    @JsonProperty("width")
    private Double width;
    /**
     * 高
     */
    @JsonProperty("height")
    private Double height;
    /**
     * 数量
     */
    @JsonProperty("quantity")
    private Integer quantity;
    /**
     * 体积
     */
    @JsonProperty("volume")
    private Double volume;
    /**
     * 计费金额
     */
    @JsonProperty("bill_amount")
    private Integer billAmount;
    /**
     * 计费币种
     */
    @JsonProperty("bill_currency_code")
    private String billCurrencyCode;
    /**
     * 结算金额
     */
    @JsonProperty("settlement_amount")
    private Double settlementAmount;
    /**
     * 结算币种
     */
    @JsonProperty("settlement_currency_code")
    private String settlementCurrencyCode;
    /**
     * 库龄
     */
    @JsonProperty("day")
    private Integer day;
    /**
     * 仓库代码
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;
}
