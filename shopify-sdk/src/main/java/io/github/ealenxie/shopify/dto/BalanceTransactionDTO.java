package io.github.ealenxie.shopify.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BalanceTransactionDTO {
    private String id;
    private String object;
    @JsonProperty("exchange_rate")
    private String exchangeRate;
}
