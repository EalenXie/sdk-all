package io.github.ealenxie.pingpong.v2.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/6/9 9:36
 * @version 1.0
 */
@Getter
@Setter
public class SpecialAccountStatementDTO extends PageDTO {
    /**
     * 客户ID
     */
    @JsonProperty("clientId")
    private String clientId;
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
