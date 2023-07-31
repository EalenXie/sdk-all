package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/29 17:02
 */
@Getter
@Setter
public class CopyReg {
    /**
     * 首次发表日期
     */
    @JsonProperty("publishTime")
    private String publishTime;
    /**
     * 登记日期
     */
    @JsonProperty("regTime")
    private String regTime;
    /**
     * 登记号
     */
    @JsonProperty("regNum")
    private String regNum;
    /**
     * 简称
     */
    @JsonProperty("simpleName")
    private String simpleName;
    /**
     * 全称
     */
    @JsonProperty("fullName")
    private String fullName;
    /**
     * 著作权人
     */
    @JsonProperty("authorNationality")
    private String authorNationality;
    /**
     * id
     */
    @JsonProperty("id")
    private Integer id;
    /**
     * 分类号
     */
    @JsonProperty("catNum")
    private String catNum;
    /**
     * 版本号
     */
    @JsonProperty("version")
    private String version;
}
