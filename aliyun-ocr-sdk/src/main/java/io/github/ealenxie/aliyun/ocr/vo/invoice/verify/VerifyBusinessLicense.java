package io.github.ealenxie.aliyun.ocr.vo.invoice.verify;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/7 17:20
 */
@Getter
@Setter
public class VerifyBusinessLicense {


    /**
     * 状态码
     */
    @JsonProperty("code")
    private String code;
    /**
     * 状态码
     */
    @JsonProperty("data")
    private Boolean data;
    /**
     * 状态码
     */
    @JsonProperty("message")
    private String message;
}
