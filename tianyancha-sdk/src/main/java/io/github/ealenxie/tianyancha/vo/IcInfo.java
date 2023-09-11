package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/9/11 9:30
 */
@Getter
@Setter
public class IcInfo {
    /**
     * 表对应id
     */
    @JsonProperty("id")
    private Long id;

    /**
     * 注册地址/统一信用代码/分支机构名称/商业范围/公司类型/注册号/经营期限/注册资本/注册号/历史名称/名称
     */
    @JsonProperty("name")
    private String name;

    /**
     * 变更时间（时间戳）
     */
    @JsonProperty("time")
    private Long time;

    /**
     * 无用字段
     */
    @JsonProperty("toco")
    private Long toco;

    /**
     * logo
     */
    @JsonProperty("logo")
    private String logo;

    /**
     * 无用字段
     */
    @JsonProperty("startTime")
    private Long startTime;

    /**
     * 无用字段
     */
    @JsonProperty("type")
    private Long type;

    /**
     * 无用字段
     */
    @JsonProperty("relation")
    private Long relation;
}
