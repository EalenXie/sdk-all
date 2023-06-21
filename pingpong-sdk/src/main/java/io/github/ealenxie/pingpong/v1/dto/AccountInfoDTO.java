package io.github.ealenxie.pingpong.v1.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/30 11:26
 */
@Getter
@Setter
public class AccountInfoDTO extends PingPongDTO {
    /**
     * 客户Id
     */
    @JsonProperty("client_id")
    private String clientId;
    /**
     * 店铺Id
     */
    @JsonProperty("account_id")
    private String accountId;

    public AccountInfoDTO() {
    }

    public AccountInfoDTO(String appId, String appSecret, String clientId, String accountId) {
        super(appId, appSecret);
        this.clientId = clientId;
        this.accountId = accountId;
    }
}
