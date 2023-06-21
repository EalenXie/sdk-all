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
public class AccountBalance {
    /**
     * 客户ID
     */
    @JsonProperty("client_id")
    private String clientId;
    /**
     * 客户店铺余额信息
     */
    @JsonProperty("clientBalanceList")
    private List<ClientBalance> clientBalances;
}
