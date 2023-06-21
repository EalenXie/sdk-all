package io.github.ealenxie.pingpong.v1.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/30 16:32
 */
@Getter
@Setter
public class WithdrawDetailDTO extends PingPongDTO {
    /**
     * 提现流水号
     */
    @JsonProperty("tx_id")
    private String txId;

    public WithdrawDetailDTO() {
    }

    public WithdrawDetailDTO(String appId, String appSecret, String txId) {
        super(appId, appSecret);
        this.txId = txId;
    }
}
