package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/29 17:02
 */
@Getter
@Setter
public class Icp {
    /**
     * 网址
     */
    @JsonProperty("webSite")
    private List<String> webSite;
    /**
     * 许可证
     */
    @JsonProperty("license")
    private String license;
    /**
     * 域名
     */
    @JsonProperty("ym")
    private String ym;
    /**
     * 公司类型
     */
    @JsonProperty("companyType")
    private String companyType;
    /**
     * 公司名
     */
    @JsonProperty("companyName")
    private String companyName;
    /**
     * 检查时间
     */
    @JsonProperty("examineDate")
    private String examineDate;
    /**
     * 网站名称
     */
    @JsonProperty("webName")
    private String webName;
}
