package io.github.ealenxie.lianlian.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/4/7 13:56
 */
@Getter
@Setter
public class BalanceVO {

    /**
     * 币种
     */
    @JsonProperty("currency")
    private String currency;
    /**
     * 余额
     */
    @JsonProperty("balance")
    private String balance;
    /**
     * 账户数量
     */
    @JsonProperty("accountNum")
    private Integer accountNum;
}
