package io.github.ealenxie.paypal.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Balances {

    /**
     * 所列余额的货币代码。
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * 表示货币是否为主要货币的可选字段。
     */
    @JsonProperty("primary")
    private Boolean primary;

    /**
     * PayPal 帐户中的总金额。它是所有其他余额的总和。
     */
    @JsonProperty("total_balance")
    private Money totalBalance;

    /**
     * 客户可支配的账户中的现金金额。此金额在为用户定义的用户时区中的结算截止时间捕获。
     */
    @JsonProperty("available_balance")
    private Money availableBalance;

    /**
     * 账户中预扣的余额。PayPal 为客户持有的资金中当前无法由客户支配的部分。
     */
    @JsonProperty("withheld_balance")
    private Money withheldBalance;
}
