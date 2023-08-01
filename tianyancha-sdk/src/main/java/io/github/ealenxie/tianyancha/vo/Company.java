package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/8/1 11:34
 */
@Getter
@Setter
public class Company {
    /**
     * 省份简称
     */
    @JsonProperty("base")
    private String base;

    /**
     * 开业时间（时间戳）
     */
    @JsonProperty("estiblishTime")
    private long estiblishTime;

    /**
     * 经营状态
     */
    @JsonProperty("regStatus")
    private String regStatus;

    /**
     * 类型
     */
    @JsonProperty("type")
    private String type;

    /**
     * 公司id
     */
    @JsonProperty("cid")
    private long cid;

    /**
     * 注册资本
     */
    @JsonProperty("regCapital")
    private String regCapital;

    /**
     * 公司名
     */
    @JsonProperty("name")
    private String name;
}
