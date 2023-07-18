package io.github.ealenxie.paypal.transaction;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PayerName {

    /**
     * 当当事人是一个人时，当事人的名字或名字。
     */
    @JsonProperty("given_name")
    private String givenName;

    /**
     * 当事人为人时，当事人的姓氏或姓氏。也称为姓氏
     */
    @JsonProperty("surname")
    private String surname;

    /**
     * 备用名
     */
    @JsonProperty("alternate_full_name")
    private String alternateFullName;
}
