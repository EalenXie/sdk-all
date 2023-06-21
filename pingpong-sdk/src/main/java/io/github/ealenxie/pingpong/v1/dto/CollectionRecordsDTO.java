package io.github.ealenxie.pingpong.v1.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by EalenXie on 2022/3/30 16:46
 * 时间范围不超过1个月
 */
@Getter
@Setter
public class CollectionRecordsDTO extends PingPongDTO {

    /**
     * 客户Id
     */
    @JsonProperty("client_id")
    private String clientId;
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
    /**
     * 页码
     */
    @JsonProperty("pg_no")
    private Integer pgNo;
}
