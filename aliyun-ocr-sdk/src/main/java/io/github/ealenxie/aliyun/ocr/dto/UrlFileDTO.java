package io.github.ealenxie.aliyun.ocr.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/23 11:36
 * 文件或URL 请求
 */
@Getter
@Setter
@NoArgsConstructor
public class UrlFileDTO implements OcrFile {

    /**
     * 请求的图片 url地址
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("Url")
    private String url;
    /**
     * 请求的文件 字节
     */
    @JsonIgnore
    private byte[] body;

    public UrlFileDTO(String url) {
        this.url = url;
    }

    public UrlFileDTO(byte[] body) {
        this.body = body;
    }

    @Override
    public byte[] getBytes() {
        return body;

    }
}
