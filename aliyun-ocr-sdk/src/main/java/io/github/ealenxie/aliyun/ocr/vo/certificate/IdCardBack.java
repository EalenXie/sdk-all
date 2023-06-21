package io.github.ealenxie.aliyun.ocr.vo.certificate;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/4/4 16:10
 */
@Setter
@Getter
public class IdCardBack {
    /**
     * 签发机关
     */
    @JsonProperty("issueAuthority")
    private String issueAuthority;
    /**
     * 有效期限
     */
    @JsonProperty("validPeriod")
    private String validPeriod;
}
