package io.github.ealenxie.pingpong.v2.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/6/8 17:02
 * @version 1.0
 */
@Getter
@Setter
public class WithdrawDetailDTO extends PageDTO {
    /**
     * 客户ID
     */
    @JsonProperty("clientId")
    private String clientId;
    /**
     * 提现流⽔号
     */
    @JsonProperty("withdrawId")
    private String withdrawId;
}
