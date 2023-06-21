package io.github.ealenxie.payoneer.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/31 13:25
 */
@Getter
@Setter
public class Transaction {
    @JsonProperty("transactions")
    private PayoneerPage<TransactionItem> transactions;
}
