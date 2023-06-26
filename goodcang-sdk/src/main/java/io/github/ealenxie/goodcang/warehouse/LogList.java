package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 16:38
 */
@Getter
@Setter
public class LogList {
    /**
     * 认领单号
     */
    @JsonProperty("claim_code")
    private String claimCode;
    /**
     * 操作人名称
     */
    @JsonProperty("user_name")
    private String userName;
    /**
     * 创建时间
     */
    @JsonProperty("create_time")
    private String createTime;
    /**
     * 日志内容
     */
    @JsonProperty("content")
    private String content;
    /**
     * 操作人code
     */
    @JsonProperty("user_code")
    private String userCode;
    /**
     * 之前
     */
    @JsonProperty("before")
    private String before;
    /**
     * 之后
     */
    @JsonProperty("after")
    private String after;
    /**
     * 类型
     */
    @JsonProperty("type")
    private Integer type;
}
