package io.github.ealenxie.edayun.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * EDA创建物流订单 产品信息
 */
@Getter
@Setter
public class Item {
    /**
     * 创建平台SKU定义的平台产品Sku（现在不会在创建订单时增加对应的陈列产品，所以在订单中只会有产品信息）
     */
    private String channelSku;
    /**
     * 产品SKU (必填)
     */
    private String sku;
    /**
     * 平台SKU描述，货品名称
     */
    private String description;
    /**
     * 产品下单数量 (必填)
     */
    private Integer quantity;
    /**
     * 平台SKU单价
     */
    private Float unitPrice;
    /**
     * 平台Item ID
     */
    private String channelItemId;
    /**
     * 批号
     */
    @JsonProperty("Lot")
    private String lot;
    /**
     * 温层
     */
    private String temperatureLevel;
    /**
     * eBay订单货品ID
     */
    private String ebayItemId;
    /**
     * eBay订单交易ID
     */
    private String ebayTransactionId;
    /**
     * 是否非标准订单，是传true，否传false
     */
    private Boolean nonStandardOrder;

}
