package io.github.ealenxie.goodcang.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/25 13:09
 */
@Getter
@Setter
public class AttachmentResponse {

    /**
     * 附件ID（整型）
     */
    @JsonProperty("attachment_id")
    private Integer attachmentId;
}
