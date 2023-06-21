package io.github.ealenxie.pingpong.v2.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/6/9 9:19
 * @version 1.0
 */
@Getter
@Setter
public class CollectionRecordDTO extends PageDTO {
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
     * 店铺在平台的唯⼀ID
     */
    @JsonProperty("sellerId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sellerId;
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
