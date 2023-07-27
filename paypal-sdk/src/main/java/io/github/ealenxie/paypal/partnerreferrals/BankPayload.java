package io.github.ealenxie.paypal.partnerreferrals;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/27 9:04
 * @version 1.0
 */
@Getter
@Setter
public class BankPayload {
    /**
     * nickName
     */
    @JsonProperty("nick_name")
    private String nickName;
    /**
     * accountNumber
     */
    @JsonProperty("account_number")
    private String accountNumber;
    /**
     * accountType
     */
    @JsonProperty("account_type")
    private String accountType;
    /**
     * currencyCode
     */
    @JsonProperty("currency_code")
    private String currencyCode;
    /**
     * identifiers
     */
    @JsonProperty("identifiers")
    private List<Identifier> identifiers;
}
