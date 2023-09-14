package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CasePerson {
    /**
     * 案件身份
     */
    @JsonProperty("role")
    private String role;

    /**
     * 类型（1=人员；2=公司）
     */
    @JsonProperty("type")
    private String type;

    /**
     * 名称
     */
    @JsonProperty("name")
    private String name;

    /**
     * ID
     */
    @JsonProperty("gid")
    private String gid;

    /**
     * 结果标签
     */
    @JsonProperty("result")
    private String result;

    /**
     * 裁判结果对应的情感倾向（1=正面；0=中性；-1=负面）
     */
    @JsonProperty("emotion")
    private Integer emotion;
}