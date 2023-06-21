package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author jadechiang
 * @since 2023/6/14 15:15
 */
@Setter
@Getter
public class Result5 {
    /**
     * 企业介绍
     */
    @JsonProperty("baseInfo")
    private String baseInfo;
    /**
     * 经营状态
     */
    @JsonProperty("regStatus")
    private String regStatus;
    /**
     * 注册资本
     */
    @JsonProperty("regCapital")
    private String regCapital;
    /**
     * 经费来源
     */
    @JsonProperty("expendSource")
    private String expendSource;
    /**
     * 企业联系方式列表
     */
    @JsonProperty("phoneList")
    private List<String> phoneList;
    /**
     * 第二名称
     */
    @JsonProperty("nameSecond")
    private String nameSecond;
    /**
     * 第三举办单位
     */
    @JsonProperty("regUnitNameThird")
    private String regUnitNameThird;
    /**
     * 法定代表人名称
     */
    @JsonProperty("legalPersonName")
    private String legalPersonName;
    /**
     * 统一社会信用代码
     */
    @JsonProperty("usCreditCode")
    private String usCreditCode;
    /**
     * 宗旨和业务范围
     */
    @JsonProperty("scope")
    private String scope;
    /**
     * logo
     */
    @JsonProperty("logo")
    private String logo;
    /**
     * id
     */
    @JsonProperty("id")
    private Long id;
    /**
     * 举办单位名称
     */
    @JsonProperty("regUnitName")
    private String regUnitName;
    /**
     * 登记管理机关
     */
    @JsonProperty("holdUnit")
    private String holdUnit;
    /**
     * 地址
     */
    @JsonProperty("address")
    private String address;
    /**
     * 其它举办单位
     */
    @JsonProperty("regUnitNameOther")
    private String regUnitNameOther;
    /**
     * 事业单位
     */
    @JsonProperty("entityType")
    private Integer entityType;
    /**
     * 是否有年报
     */
    @JsonProperty("haveReport")
    private Boolean haveReport;
    /**
     * 地址
     */
    @JsonProperty("regLocation")
    private String regLocation;
    /**
     * 原证书号
     */
    @JsonProperty("oldCert")
    private String oldCert;
    /**
     * 其他名称
     */
    @JsonProperty("nameOther")
    private String nameOther;
    /**
     * 法定代表人id
     */
    @JsonProperty("legalPersonId")
    private String legalPersonId;
    /**
     * 设立登记时间
     */
    @JsonProperty("regTime")
    private String regTime;
    /**
     * 企业联系方式
     */
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    /**
     * 第三名称
     */
    @JsonProperty("nameThird")
    private String nameThird;
    /**
     * 单位名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 有效期
     */
    @JsonProperty("validTime")
    private String validTime;
    /**
     * 第二举办单位
     */
    @JsonProperty("regUnitNameSecond")
    private String regUnitNameSecond;
    /**
     * 省份
     */
    @JsonProperty("base")
    private String base;
}
