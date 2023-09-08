package io.github.ealenxie.payoneer.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.payoneer.PageItems;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/6/30 12:40
 */
@Getter
@Setter
public class ReceivingAccountsResponse {
    @JsonProperty("receiving_accounts")
    private PageItems<ReceiveAccount> receivingAccounts;

}
