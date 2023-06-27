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
public class ServiceReplyList {
    /**
     * 回复结果
     */
    @JsonProperty("handle_result")
    private String handleResult;
    /**
     * 处理人
     */
    @JsonProperty("handle_user")
    private String handleUser;
    /**
     * 附件
     */
    @JsonProperty("attachment_file_list")
    private List<AttachmentFile> attachmentFileList;
}
