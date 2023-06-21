package io.github.ealenxie.pingpong.v2.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/6/8 16:34
 * @version 1.0
 */
@Getter
@Setter
public class AccountStatementDTO extends PageDTO {
    /**
     * 客户ID
     */
    @JsonProperty("clientId")
    private String clientId;
    /**
     * 平台CODE
     */
    @JsonProperty("platform")
    private String platform;
    /**
     * 店铺收款账户ID
     */
    @JsonProperty("accountId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String accountId;
    /**
     * 开始时间unix时间戳（秒）
     */
    @JsonProperty("startTime")
    private String startTime;
    /**
     * 结束时间unix时间戳（秒）
     */
    @JsonProperty("endTime")
    private String endTime;
}
