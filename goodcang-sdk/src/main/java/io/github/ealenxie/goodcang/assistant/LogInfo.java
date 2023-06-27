package io.github.ealenxie.goodcang.assistant;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/27 10:22
 */
@Getter
@Setter
public class LogInfo {
    /**
     * 附件操作人
     */
    @JsonProperty("handle_user")
    private String handleUser;
    /**
     * 状态查件状态文本
     */
    @JsonProperty("io_status_text")
    private String ioStatusText;
    /**
     * 操作时间
     */
    @JsonProperty("add_time")
    private String addTime;
}
