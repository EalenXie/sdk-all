package io.github.ealenxie.edayun.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ErrorMessage implements Serializable {
    /**
     * 状态码
     */
    @JsonProperty("code")
    private String code;
    /**
     * 错误描述
     */
    @JsonProperty("desc")
    private String desc;
    @JsonProperty("severity")
    private String severity;
    @JsonProperty("language")
    private String language;
    @JsonProperty("category")
    private String category;
    @JsonProperty("refNum")
    private String refNum;

}

