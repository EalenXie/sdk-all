package io.github.ealenxie.aliyun.ocr.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/4/1 15:37
 */
@Getter
@Setter
public class OcrResponse {
    @JsonProperty("RequestId")
    private String requestId;
    @JsonProperty("Data")
    private String data;
    @JsonProperty("Code")
    private String code;
    @JsonProperty("Message")
    private String message;
}
