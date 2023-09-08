package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PastStaffer {
    /**
     * 名称
     */
    @JsonProperty("name")
    private String name;

    /**
     * 人id
     */
    @JsonProperty("id")
    private Long id;

    /**
     * 人员hcgid
     */
    @JsonProperty("hcgid")
    private String hcgid;

    /**
     * 卸任时间
     */
    @JsonProperty("time")
    private String time;

    /**
     * logo
     */
    @JsonProperty("logo")
    private String logo;

    /**
     * 关系类型
     */
    @JsonProperty("relation")
    private Integer relation;

    /**
     * 关联公司数量
     */
    @JsonProperty("toco")
    private Integer toco;

    /**
     * 无用
     */
    @JsonProperty("type")
    private Integer type;
}
