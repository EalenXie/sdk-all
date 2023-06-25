package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/25 17:46
 */
@Getter
@Setter
public class FilePayload {
    /**
     * 文件类型
     */
    @JsonProperty("file_type")
    private String fileType;
    /**
     * 文件地址
     */
    @JsonProperty("file_url")
    private String fileUrl;
}
