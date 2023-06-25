package io.github.ealenxie.goodcang.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/25 13:07
 */
@Getter
@Setter
public class UploadAttachmentPayload {


    /**
     * 文件base64内容
     */
    @JsonProperty("file")
    private String file;
    /**
     * 用途枚举选项
     */
    @JsonProperty("use_for")
    private String useFor;
    /**
     * 用途枚举选项
     */
    @JsonProperty("file_name")
    private String fileName;
}
