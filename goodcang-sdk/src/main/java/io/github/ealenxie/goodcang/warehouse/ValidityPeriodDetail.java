package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 15:43
 */
@Getter
@Setter
public class ValidityPeriodDetail {

    /**
     * 商品Sku
     */
    @JsonProperty("product_sku")
    private String productSku;
    /**
     * 换标编码
     */
    @JsonProperty("custom_product_sku")
    private String customProductSku;
    /**
     * 有效期天数
     */
    @JsonProperty("validity_period_days")
    private Integer validityPeriodDays;
    /**
     * 上架数量
     */
    @JsonProperty("on_shelf_num")
    private Integer onShelfNum;
    /**
     * 实收数量
     */
    @JsonProperty("receipt_num")
    private Integer receiptNum;
    /**
     * 生产日期
     */
    @JsonProperty("creation_date")
    private String creationDate;
    /**
     * 过期日期
     */
    @JsonProperty("expiration_date")
    private String expirationDate;
}
