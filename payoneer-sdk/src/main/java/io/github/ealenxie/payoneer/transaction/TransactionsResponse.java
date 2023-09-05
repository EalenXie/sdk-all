package io.github.ealenxie.payoneer.transaction;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.payoneer.PageItems;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/31 13:25
 */
@Getter
@Setter
public class TransactionsResponse {
    @JsonProperty("transactions")
    private PageItems<Transaction> transactions;
}
