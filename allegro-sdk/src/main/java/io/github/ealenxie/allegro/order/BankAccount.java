package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/4 13:21
 * @version 1.0
 */
@Getter
@Setter
public class BankAccount {
    /**
     * owner
     */
    @JsonProperty("owner")
    private String owner;
    /**
     * accountNumber
     */
    @JsonProperty("accountNumber")
    private String accountNumber;
    /**
     * iban
     */
    @JsonProperty("iban")
    private String iban;
    /**
     * swift
     */
    @JsonProperty("swift")
    private String swift;
    /**
     * address
     */
    @JsonProperty("address")
    private Address address;
}
