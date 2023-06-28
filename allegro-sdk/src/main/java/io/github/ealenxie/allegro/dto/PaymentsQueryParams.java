package io.github.ealenxie.allegro.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/2/20 17:51
 * @version 1.0
 */
@Getter
@Setter
public class PaymentsQueryParams {
    /**
     * 钱包类型
     * 枚举：AVAILABLE、WAITING
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("wallet.type")
    private String type;
    /**
     * 支付操作符
     * 枚举：PAYU、P24
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("wallet.paymentOperator")
    private String paymentOperator;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("payment.id")
    private String paymentId;
    /**
     * Login of the participant. In case of REFUND_INCREASE operation this is the login of the seller, in other cases, of the buyer.
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("participant.login")
    private String participantLogin;
    /**
     * 开始时间，格式：2019-05-08T09:45:20.818Z
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("occurredAt.gte")
    private String occurredAtGte;
    /**
     * 结束时间，格式：2019-05-08T09:45:20.818Z
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("occurredAt.lte")
    private String occurredAtLte;
    /**
     * 操作类型组
     * 枚举：INCOME、OUTCOME、REFUND、BLOCKADES
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("group")
    private String group;
    /**
     * 市场id
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("marketplaceId")
    private String marketplaceId;
    /**
     * 币种
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("currency")
    private String currency;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("limit")
    private Integer limit = 50;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("offset")
    private Integer offset = 0;

}
