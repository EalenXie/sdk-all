package io.github.ealenxie.pingpong.v1.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/3/30 14:29
 */
@Getter
@Setter
public class ClientBalance {
    /**
     * 店铺ID
     */
    @JsonProperty("account_id")
    private String accountId;
    /**
     * 余额信息
     */
    @JsonProperty("accountBalanceList")
    private List<Balance> accountBalanceList;
}
