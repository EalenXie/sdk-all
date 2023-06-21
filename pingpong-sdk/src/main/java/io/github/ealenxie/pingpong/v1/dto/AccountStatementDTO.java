package io.github.ealenxie.pingpong.v1.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by EalenXie on 2022/3/30 11:26
 */
@Getter
@Setter
public class AccountStatementDTO extends PingPongDTO {
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
    /**
     * 开始时间(格式：yyyyMMddHHmmss)
     */
    @JsonProperty("start_time")
    @JsonFormat(pattern = "yyyyMMddHHmmss", timezone = "GMT+8")
    private Date startTime;
    /**
     * 结束时间(格式：yyyyMMddHHmmss)
     */
    @JsonProperty("end_time")
    @JsonFormat(pattern = "yyyyMMddHHmmss", timezone = "GMT+8")
    private Date endTime;
}
