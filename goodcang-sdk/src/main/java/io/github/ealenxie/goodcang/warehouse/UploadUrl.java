package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 13:14
 */
@Getter
@Setter
public class UploadUrl {
    /**
     * 文件类型
     */
    @JsonProperty("file_type")
    private Integer fileType;
    /**
     * 文件地址
     */
    @JsonProperty("file_url")
    private String fileUrl;
    /**
     * 文件后缀名
     */
    @JsonProperty("type")
    private String type;
}
