package io.github.ealenxie.payoneer.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.payoneer.PageItems;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/4/6 11:27
 */
@Getter
@Setter
public class BalancesResponse {

    @JsonProperty("balances")
    private PageItems<Balance> balances;
}
