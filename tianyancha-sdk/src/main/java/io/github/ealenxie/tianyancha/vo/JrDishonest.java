package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/9/18 16:15
 */
@Getter
@Setter
public class JrDishonest {

    /**
     * 法人、负责人姓名
     */
    @JsonProperty("businessentity")
    private String businessentity;

    /**
     * 省份地区
     */
    @JsonProperty("areaname")
    private String areaname;

    /**
     * 法院
     */
    @JsonProperty("courtname")
    private String courtname;

    /**
     * 未履行部分
     */
    @JsonProperty("unperformPart")
    private String unperformPart;

    /**
     * 法定负责人/主要负责人信息
     */
    @JsonProperty("staff")
    private List<RoleNameCode> staff;

    /**
     * 失信人类型，0代表人，1代表公司
     */
    @JsonProperty("type")
    private String type;

    /**
     * 已履行部分
     */
    @JsonProperty("performedPart")
    private String performedPart;

    /**
     * 失信人名称
     */
    @JsonProperty("iname")
    private String iname;

    /**
     * 失信被执行人行为具体情形
     */
    @JsonProperty("disrupttypename")
    private String disrupttypename;

    /**
     * 案号
     */
    @JsonProperty("casecode")
    private String casecode;

    /**
     * 身份证号码/组织机构代码
     */
    @JsonProperty("cardnum")
    private String cardnum;

    /**
     * 履行情况
     */
    @JsonProperty("performance")
    private String performance;

    /**
     * 立案时间
     */
    @JsonProperty("regdate")
    private Long regdate;

    /**
     * 发布时间
     */
    @JsonProperty("publishdate")
    private Long publishdate;

    /**
     * 做出执行的依据单位
     */
    @JsonProperty("gistunit")
    private String gistunit;

    /**
     * 生效法律文书确定的义务
     */
    @JsonProperty("duty")
    private String duty;

    /**
     * 执行依据文号
     */
    @JsonProperty("gistid")
    private String gistid;
}
