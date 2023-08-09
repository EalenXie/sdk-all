package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CallInfo {
    /**
     * 电话
     */
    @JsonProperty("phoneNumber")
    private String phoneNumber;

    /**
     * 号码来源
     */
    @JsonProperty("source")
    private String source;

    /**
     * 标签
     */
    @JsonProperty("tag")
    private String tag;
}