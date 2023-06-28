package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 14:39
 */
@Getter
@Setter
public class CheckoutFormSurcharge {
    /**
     * 付款id
     */
    @JsonProperty("id")
    private String id;
    /**
     * 付款方式 货到付款:CASH_ON_DELIVERY,电汇:WIRE_TRANSFER,在线付款:ONLINE,分期付款:SPLIT_PAYMENT,延期付款:EXTENDED_TERM
     */
    @JsonProperty("type")
    private String type;
    /**
     * 提供商
     */
    @JsonProperty("provider")
    private String provider;
    /**
     * 付款时间
     */
    @JsonProperty("finishedAt")
    private String finishedAt;
    /**
     * 已付金额
     */
    @JsonProperty("paidAmount")
    private Money paidAmount;
    /**
     * 协调价格
     */
    @JsonProperty("reconciliation")
    private Money reconciliation;
}
