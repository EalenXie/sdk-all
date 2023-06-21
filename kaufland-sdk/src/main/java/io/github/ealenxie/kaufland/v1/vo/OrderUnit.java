package io.github.ealenxie.kaufland.v1.vo;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 无敌暴龙战士
 * @since 2022/08/12 14:58
 */
@Getter
@Setter
public class OrderUnit {
    @JsonProperty("id_order_unit")
    private Long idOrderUnit;
    @JsonProperty("id_order")
    private String idOrder;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JsonProperty("ts_created")
    private Date tsCreated;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JsonProperty("ts_updated")
    private Date tsUpdated;
    @JsonProperty("is_marketplace_deemed_supplier")
    private Boolean isMarketplaceDeemedSupplier;
    /**
     * open 开始
     * need_to_be_sent 待发货
     * sent 已发货
     * received 已收货
     * cancelled 取消订单
     * sent_and_autopaid 发货自动付款
     * returned  退货
     * returned_paid 退款
     */
    @JsonProperty("status")
    private String status;
    @JsonProperty("cancel_reason")
    private String cancelReason;
    @JsonProperty("price")
    private BigDecimal price;
    @JsonProperty("id_offer")
    private String idOffer;
    @JsonProperty("revenue_gross")
    private BigDecimal revenueGross;
    @JsonProperty("revenue_net")
    private BigDecimal revenueNet;
    @JsonProperty("note")
    private String note;
    @JsonProperty("unit_condition")
    private String unitCondition;
    @JsonProperty("delivery_time_min")
    private Integer deliveryTimeMin;
    @JsonProperty("delivery_time_max")
    private Integer deliveryTimeMax;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JsonProperty("delivery_time_expires")
    private Date deliveryTimeExpires;
    @JsonProperty("shipping_rate")
    private BigDecimal shippingRate;
    @JsonProperty("buyer")
    private Buyer buyer;
    @JsonProperty("claim")
    private Claim claim;
    @JsonProperty("billing_address")
    private Address billingAddress;
    @JsonProperty("shipping_address")
    private Address shippingAddress;
    @JsonProperty("invoice")
    private Invoice invoice;
    @JsonProperty("item")
    private Item item;
    @JsonProperty("vat")
    private BigDecimal vat;
    @JsonProperty("delivery_time")
    private String deliveryTime;
    @JsonProperty("order_received_timestamp")
    private String orderReceivedTimestamp;
}
