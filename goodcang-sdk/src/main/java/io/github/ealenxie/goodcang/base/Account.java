package io.github.ealenxie.goodcang.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/25 12:39
 */
@Getter
@Setter
public class Account {
    /**
     * 签约主体名称
     */
    @JsonProperty("firm_name")
    private String firmName;
    /**
     * 签约主体状态
     */
    @JsonProperty("firm_status")
    private Integer firmStatus;
    /**
     * 服务主体名称
     */
    @JsonProperty("server_firm_name")
    private String serverFirmName;
    /**
     * 服务主体名称
     */
    @JsonProperty("business_type_list")
    private List<Integer> businessTypeList;
    /**
     * 账户编号
     */
    @JsonProperty("account_code")
    private String accountCode;
    /**
     * 币种信息
     */
    @JsonProperty("balance_list")
    private List<Balance> balanceList;
}
