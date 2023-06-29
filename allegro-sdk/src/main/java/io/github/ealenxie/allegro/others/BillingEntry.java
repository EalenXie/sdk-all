package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.Money;
import io.github.ealenxie.allegro.order.IdPayload;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BillingEntry {
    /**
     * 账单条目id
     */
    @JsonProperty("id")
    private String id;

    /**
     * 入账日期
     */
    @JsonProperty("occurredAt")
    private String occurredAt;

    /**
     * 账单类型
     */
    @JsonProperty("type")
    private BillingType type;

    /**
     * 账单条目的报价
     */
    @JsonProperty("offer")
    private BillingOffer offer;

    /**
     * 账单条目的货币金额
     */
    @JsonProperty("value")
    private Money value;

    /**
     * 账单条目的税率
     */
    @JsonProperty("tax")
    private BillingTax tax;

    /**
     * 账户余额
     */
    @JsonProperty("balance")
    private Money balance;

    /**
     * 与此账单关联的订单id
     */
    @JsonProperty("order")
    private IdPayload order;
}
