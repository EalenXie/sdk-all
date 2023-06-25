package io.github.ealenxie.goodcang.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/25 16:19
 */
@Getter
@Setter
public class FreezeLog {
    /**
     * 冻结状态
     */
    @JsonProperty("status_to")
    private Integer statusTo;
    /**
     * 冻结状态文本
     */
    @JsonProperty("status_to_text")
    private String statusToText;
    /**
     * 操作原因
     */
    @JsonProperty("log_content")
    private String logContent;
    /**
     * 操作时间
     */
    @JsonProperty("create_time")
    private String createTime;
}
