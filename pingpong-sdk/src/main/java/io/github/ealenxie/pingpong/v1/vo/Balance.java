package io.github.ealenxie.pingpong.v1.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/30 14:29
 */
@Getter
@Setter
public class Balance {
    /**
     * 账户当前可用余额
     */
    @JsonProperty("available_balance")
    private String availableBalance;
    /**
     * 账户当前不可用余额
     */
    @JsonProperty("frozen_balance")
    private String frozenBalance;
    /**
     * 账户币种 (eg.USD)
     */
    @JsonProperty("currency")
    private String currency;
}
