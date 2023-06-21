package io.github.ealenxie.fulfillment.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/10/8 16:04
 */
@Getter
@Setter
public class OutboundSku {
    /**
     * SKU编码
     */
    @JsonProperty("sku_code")
    private String skuCode;
    /**
     * 出库SKU失效日期;当前出库委托SKU的有效期
     */
    @JsonProperty("expired_date")
    private String expiredDate;
    /**
     * SKU出库数量
     */
    @JsonProperty("qty")
    private Integer qty;
    /**
     * SKU库存质量。如：G（良好）; B（破损）; C（违禁品）; W（淋湿）; M（霉变）; E（异常）。
     */
    @JsonProperty("stock_quality")
    private String stockQuality;
    /**
     * 数字条码
     */
    @JsonProperty("sku_id")
    private String skuId;
    /**
     * SKU名称
     */
    @JsonProperty("sku_name")
    private String skuName;
    /**
     * SKU出库批次号
     */
    @JsonProperty("batch_no")
    private String batchNo;
    /**
     * 商品条码
     */
    @JsonProperty("product_code")
    private String productCode;
}
