package io.github.ealenxie.pingpong.v2.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/6/8 16:18
 * @version 1.0
 */
@Getter
@Setter
public class AccountBalanceVO {

    /**
     * 店铺收款账户ID
     */
    @JsonProperty("accountId")
    private String accountId;
    /**
     * 余额列表
     */
    @JsonProperty("balanceList")
    private List<BalanceVO> balanceList;
}
