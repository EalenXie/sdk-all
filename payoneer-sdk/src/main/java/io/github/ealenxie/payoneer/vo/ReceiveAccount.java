package io.github.ealenxie.payoneer.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
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
