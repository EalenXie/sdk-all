package io.github.ealenxie.goodcang.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/25 12:36
 */
@Getter
@Setter
public class AccountListResponse {


    /**
     * 客户代码
     */
    @JsonProperty("customer_code")
    private String customerCode;
    /**
     * 账户信息
     */
    @JsonProperty("account_list")
    private List<Account> accountList;
}
