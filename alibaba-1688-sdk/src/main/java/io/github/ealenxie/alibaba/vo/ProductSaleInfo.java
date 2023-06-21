package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhs
 * @since 2022年12月16日 0016 09 40
 */
@Getter
@Setter
public class ProductSaleInfo {
    /**
     * 是否支持网上交易。true：支持 false：不支持，国际站不需关注此字段
     */
    @JsonProperty("supportOnlineTrade")
    private Boolean supportOnlineTrade;
    /**
     * 是否支持混批，国际站无需关注此字段
     */
    @JsonProperty("mixWholeSale")
    private Boolean mixWholeSale;
    /**
     * 销售方式，按件卖(normal)或者按批卖(batch)，1688站点无需关注此字段
     */
    @JsonProperty("saleType")
    private String saleType;
    /**
     * 是否价格私密信息，国际站无需关注此字段
     */
    @JsonProperty("priceAuth")
    private Boolean priceAuth;
    /**
     * 区间价格。按数量范围设定的区间价格
     */
    @JsonProperty("priceRanges")
    private List<PriceRange> priceRanges;
    /**
     * 可售数量，国际站无需关注此字段
     */
    @JsonProperty("amountOnSale")
    private Double amountOnSale;
    /**
     * 计量单位
     */
    @JsonProperty("unit")
    private String unit;
    /**
     * 最小起订量，范围是1-99999。
     */
    @JsonProperty("minOrderQuantity")
    private Integer minOrderQuantity;
    /**
     * 每批数量，默认为空或者非零值，该属性不为空时sellunit为必填
     */
    @JsonProperty("batchNumber")
    private Integer batchNumber;
    /**
     * 建议零售价，国际站无需关注
     */
    @JsonProperty("retailprice")
    private Double retailPrice;
    /**
     * 税率相关信息，内容由用户自定，国际站无需关注
     */
    @JsonProperty("tax")
    private String tax;
    /**
     * 售卖单位，如果为批量售卖，代表售卖的单位，该属性不为空时batchNumber为必填，例如1"手"=12“件"的"手"，国际站无需关注
     */
    @JsonProperty("sellunit")
    private String sellUnit;
    /**
     * 普通报价-FIXED_PRICE("0"),SKU规格报价-SKU_PRICE("1"),SKU区间报价（商品维度）-SKU_PRICE_RANGE_FOR_OFFER("2"),SKU区间报价（SKU维度）-SKU_PRICE_RANGE("3")，国际站无需关注
     */
    @JsonProperty("quoteType")
    private Integer quoteType;
    /**
     * 分销基准价
     */
    @JsonProperty("consignPrice")
    private Double consignPrice;
}
