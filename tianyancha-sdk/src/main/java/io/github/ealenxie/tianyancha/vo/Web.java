package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Web {
    /**
     * 网站类型
     */
    @JsonProperty("webType")
    private String webType;

    /**
     * 网址
     */
    @JsonProperty("website")
    private String website;

    /**
     * 名称
     */
    @JsonProperty("name")
    private String name;
}