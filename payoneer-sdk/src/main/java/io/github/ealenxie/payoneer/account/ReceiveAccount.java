package io.github.ealenxie.payoneer.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.payoneer.PayoneerPage;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/6/30 12:40
 */
@Getter
@Setter
public class ReceiveAccount {
    @JsonProperty("receiving_accounts")
    private PayoneerPage<ReceiveAccountItem> receivingAccounts;

}
