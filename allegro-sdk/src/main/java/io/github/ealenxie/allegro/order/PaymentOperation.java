package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/2/21 13:09
 * @version 1.0
 */
@Getter
@Setter
public class PaymentOperation {
    /**
     * 枚举：CORRECTION、CONTRIBUTION、PAYOUT、PAYOUT_CANCEL、REFUND_INCREASE、REFUND_CHARGE、REFUND_CANCEL、SURCHARGE、DEDUCTION_CHARGE、DEDUCTION_INCREASE、BLOCKADE、BLOCKADE_RELEASE、COMPENSATION
     */
    @JsonProperty("type")
    private String type;
    /**
     * 枚举：INCOME、OUTCOME、REFUND、BLOCKADES
     */
    @JsonProperty("group")
    private String group;
    /**
     * 钱包信息
     */
    @JsonProperty("wallet")
    private Wallet wallet;
    /**
     * 发生日期
     */
    @JsonProperty("occurredAt")
    private String occurredAt;
    /**
     * 支付信息
     */
    @JsonProperty("value")
    private Money value;
    /**
     * 市场id
     */
    @JsonProperty("marketplaceId")
    private String marketplaceId;
    @JsonProperty("payment")
    private IdPayload payment;
    @JsonProperty("deduction")
    private IdPayload deduction;
    @JsonProperty("participant")
    private Participant participant;
    @JsonProperty("payout")
    private IdPayload payout;
}
