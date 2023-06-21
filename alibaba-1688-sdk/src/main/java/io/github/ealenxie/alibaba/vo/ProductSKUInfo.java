package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhs
 * @since 2022年12月16日 0016 09 30
 */
@Getter
@Setter
public class ProductSKUInfo {

    /**
     * SKU属性值，可填多组信息
     */
    @JsonProperty("attributes")
    private List<SKUAttrInfo> attributes;
    /**
     * 指定规格的货号，国际站无需关注
     */
    @JsonProperty("cargoNumber")
    private String cargoNumber;
    /**
     * 可销售数量，国际站无需关注
     */
    @JsonProperty("amountOnSale")
    private Integer amountOnSale;
    /**
     * 建议零售价，国际站无需关注
     */
    @JsonProperty("retailPrice")
    private double retailPrice;
    /**
     * 报价时该规格的单价，国际站注意要点：含有SKU属性的在线批发产品设定具体价格时使用此值，若设置阶梯价格则使用priceRange
     */
    @JsonProperty("price")
    private Double price;
    /**
     * 阶梯报价，1688无需关注
     */
    @JsonProperty("priceRange")
    private List<PriceRange> priceRange;
    /**
     * 商品编码，1688无需关注
     */
    @JsonProperty("skuCode")
    private String skuCode;
    /**
     * skuId, 国际站无需关注
     */
    @JsonProperty("skuId")
    private Long skuId;
    /**
     * specId, 国际站无需关注
     */
    @JsonProperty("specId")
    private String specId;
    /**
     * 分销基准价
     */
    @JsonProperty("consignPrice")
    private Double consignPrice;
}
