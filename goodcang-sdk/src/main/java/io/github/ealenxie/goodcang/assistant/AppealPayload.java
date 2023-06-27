package io.github.ealenxie.goodcang.assistant;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/27 10:22
 */
@Getter
@Setter
public class AppealPayload {
    /**
     * 复查时间
     */
    @JsonProperty("add_time")
    private String addTime;
    /**
     * 申诉附件
     */
    @JsonProperty("attachment_file_list")
    private List<AttachmentFile> attachmentFileList;
    /**
     * 申诉需求
     */
    @JsonProperty("io_desc")
    private String ioDesc;
    /**
     * 回复结果
     */
    @JsonProperty("handle_info")
    private HandleInfo handleInfo;
    /**
     * 回复时间
     */
    @JsonProperty("reply_time")
    private String replyTime;
}
