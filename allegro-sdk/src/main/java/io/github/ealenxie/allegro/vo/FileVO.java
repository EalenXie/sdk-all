package io.github.ealenxie.allegro.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FileVO {
    @JsonProperty("name")
    private String name;
    /**
     * 上传时间
     */
    @JsonProperty("uploadedAt")
    private String uploadedAt;
    /**
     * 安全验证
     */
    @JsonProperty("securityVerification")
    private SecurityVerification securityVerification;
}