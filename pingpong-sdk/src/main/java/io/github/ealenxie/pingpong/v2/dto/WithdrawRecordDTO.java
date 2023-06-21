package io.github.ealenxie.pingpong.v2.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/6/8 16:50
 * @version 1.0
 */
@Getter
@Setter
public class WithdrawRecordDTO extends PageDTO {
    /**
     * 客户ID
     */
    @JsonProperty("clientId")
    private String clientId;
    /**
     * 提现币种
     */
    @JsonProperty("applyCurrency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String applyCurrency;
    /**
     * 提现到账银⾏账号
     */
    @JsonProperty("bankNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String bankNumber;
    /**
     * 开始时间unix时间戳（秒）
     */
    @JsonProperty("startTime")
    private String startTime;
    /**
     * 结束时间 unix时间戳（秒），endTime-startTime<=2592000(30天)
     */
    @JsonProperty("endTime")
    private String endTime;
}
