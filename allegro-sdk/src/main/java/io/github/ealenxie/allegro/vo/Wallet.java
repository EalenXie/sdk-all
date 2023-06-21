package io.github.ealenxie.allegro.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/2/21 13:09
 * @version 1.0
 */
@Getter
@Setter
public class Wallet {
    /**
     * 支付操作符
     * 枚举：PAYU、P24
     */
    @JsonProperty("paymentOperator")
    private String paymentOperator;
    /**
     * 钱包类型
     * 枚举：AVAILABLE、WAITING
     */
    @JsonProperty("type")
    private String type;
    /**
     * 余额
     */
    @JsonProperty("balance")
    private Money balance;
}
