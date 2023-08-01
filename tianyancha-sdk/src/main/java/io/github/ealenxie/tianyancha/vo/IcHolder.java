package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/8/1 10:08
 */
@Getter
@Setter
public class IcHolder {
    /**
     * 对应表id
     */
    @JsonProperty("id")
    private long id;

    /**
     * 公司id
     */
    @JsonProperty("cgid")
    private long cgid;

    /**
     * 人员hcgid
     */
    @JsonProperty("hcgid")
    private String hcgid;

    /**
     * logo
     */
    @JsonProperty("logo")
    private String logo;

    /**
     * 股东名
     */
    @JsonProperty("name")
    private String name;

    /**
     * 简称
     */
    @JsonProperty("alias")
    private String alias;

    /**
     * 实缴
     */
    @JsonProperty("capitalActl")
    private List<Capital> capitalActl;

    /**
     * 股东类型 1-公司 2-人 3-其它
     */
    @JsonProperty("type")
    private int type;

    /**
     * 认缴
     */
    @JsonProperty("capital")
    private List<Capital> capital;
}
