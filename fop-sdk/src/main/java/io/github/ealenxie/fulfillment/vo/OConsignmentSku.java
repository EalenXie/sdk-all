package io.github.ealenxie.fulfillment.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 4PX商品参数
 */
@Getter
@Setter
public class OConsignmentSku {
    /**
     * 出库SKU编码   必填
     */
    @JsonProperty("sku_code")
    private String skuCode;
    /**
     * vc箱唛号与po单号对象数组
     */
    @JsonProperty("cartonNumber")
    private List<CartonNumber> cartonNumbers;
    /**
     * 平台item ID
     */
    @JsonProperty("item_id")
    private String itemId;
    /**
     * 出库SKU数量   必填
     */
    @JsonProperty("qty")
    private Integer qty;
    /**
     * SKU库存质量 必填 可选值：G（良好）; B（破损）; R（退件）; C（违禁品）; W（淋湿）; M（霉变）; E（异常）。*注：如果选择是标准出库，SKU的库存质量只能选择良好。
     */
    @JsonProperty("stock_quality")
    private String stockQuality;
    /**
     * 批次号
     */
    @JsonProperty("batch_no")
    private String batchNo;
    /**
     * SKU单价
     */
    @JsonProperty("unit_price")
    private String unitPrice;
    /**
     * SKU销售价值单位 --- CNY
     */
    @JsonProperty("units")
    private String units;
}
