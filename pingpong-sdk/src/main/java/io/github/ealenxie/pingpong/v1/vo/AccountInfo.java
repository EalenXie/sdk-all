package io.github.ealenxie.pingpong.v1.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/30 14:01
 */
@Getter
@Setter
public class AccountInfo {
    /**
     * 客户ID
     */
    @JsonProperty("client_id")
    private String clientId;
    /**
     * 店铺ID
     */
    @JsonProperty("account_id")
    private String accountId;
    /**
     * 该账户对应的店铺地区
     */
    @JsonProperty("nation")
    private String nation;
    /**
     * 收款银行信息
     */
    @JsonProperty("bank_info")
    private BankInfo bankInfo;
}
