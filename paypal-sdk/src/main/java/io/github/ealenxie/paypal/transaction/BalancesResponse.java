package io.github.ealenxie.paypal.transaction;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BalancesResponse {

    /**
     * 加密余额
     */
    @JsonProperty("crypto_balances")
    private List<CryptoBalance> cryptoBalances;

    /**
     * 余额
     */
    @JsonProperty("balances")
    private List<Balance> balances;

    /**
     * 账户 ID
     */
    @JsonProperty("account_id")
    private String accountId;

    /**
     * 截止时间
     */
    @JsonProperty("as_of_time")
    private String asOfTime;

    /**
     * 上次刷新时间
     */
    @JsonProperty("last_refresh_time")
    private String lastRefreshTime;
}
