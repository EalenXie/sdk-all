package io.github.ealenxie.pingpong.v2.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author create by sch  2023/6/8 16:18
 * @version 1.0
 */
@Getter
@Setter
public class BalanceVO {
    /**
     * 可⽤余额
     */
    @JsonProperty("availableBalance")
    private BigDecimal availableBalance;
    /**
     * 待处理⾦额
     */
    @JsonProperty("unProcessBalance")
    private BigDecimal unProcessBalance;
    /**
     * 冻结⾦额
     */
    @JsonProperty("frozenBalance")
    private BigDecimal frozenBalance;
    /**
     * 币种
     */
    @JsonProperty("currency")
    private String currency;
}
