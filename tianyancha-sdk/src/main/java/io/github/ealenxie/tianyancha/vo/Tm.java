package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/29 16:55
 */
@Getter
@Setter
public class Tm {
    /**
     * 注册号
     */
    @JsonProperty("regNo")
    private String regNo;
    /**
     * 商标名称
     */
    @JsonProperty("tmName")
    private String tmName;
    /**
     * 商标图片
     */
    @JsonProperty("tmPic")
    private String tmPic;
    /**
     * 申请日期
     */
    @JsonProperty("appDate")
    private String appDate;
    /**
     * 国际分类code
     */
    @JsonProperty("tmClass")
    private String tmClass;
    /**
     * id
     */
    @JsonProperty("id")
    private Integer id;
    /**
     * 国际分类
     */
    @JsonProperty("intCls")
    private String intCls;
    /**
     * 申请人
     */
    @JsonProperty("applicantCn")
    private String applicantCn;
    /**
     * 商标流程
     */
    @JsonProperty("category")
    private String category;
    /**
     * 状态
     */
    @JsonProperty("status")
    private String status;
}
