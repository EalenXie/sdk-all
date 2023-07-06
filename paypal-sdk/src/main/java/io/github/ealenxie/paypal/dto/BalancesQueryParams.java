package io.github.ealenxie.paypal.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BalancesQueryParams {

    /**
     * 币种 默认所有
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("currency_code")
    private String currencyCode = "ALL";

    /**
     * 截至时间 如果未提供，将返回系统中最后刷新的余额。 2021-02-22T00:00:00-0700
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("as_of_time")
    private String asOfTime;

    /**
     * 是否包含加密货币
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("include_crypto_currencies")
    private Boolean includeCryptoCurrencies = Boolean.TRUE;
}
