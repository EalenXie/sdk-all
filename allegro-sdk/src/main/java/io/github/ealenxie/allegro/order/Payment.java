package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.vo.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * 支付信息实体
 * Created by EalenXie on 2022/3/24 14:39
 */
@Getter
@Setter
public class Payment {
    /**
     * 付款编号
     */
    @JsonProperty("id")
    private String id;
    /**
     * 付款方式 货到付款:CASH_ON_DELIVERY,电汇:WIRE_TRANSFER,在线付款:ONLINE,分期付款:SPLIT_PAYMENT,延期付款:EXTENDED_TERM
     * 折扣类型 优惠券购买：COUPON,捆绑购买：BUNDLE,至少有一件商品是在打开多件装选项的情况下购买的：MULTIPACK,
     * 一些商品，每件商品都来自不同的报价，作为多件装一起购买：CROSSMULTIPACK,一些物品包含在 Allegro 价格计划中：ALLEGRO_PRICES
     */
    @JsonProperty("type")
    private String type;
    /**
     * 支付提供商 P24、PAYU、OFFLINE、EPT
     */
    @JsonProperty("provider")
    private String provider;
    /**
     * 支付时间
     */
    @JsonProperty("finishedAt")
    private String finishedAt;
    /**
     * 已付金额
     */
    @JsonProperty("paidAmount")
    private Money paidAmount;


    @JsonProperty("reconciliation")
    private Money reconciliation;
}
