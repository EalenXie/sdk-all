package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/9/18 16:19
 */
@Getter
@Setter
public class HiDishonest {
    /**
     * 失信人名称
     */
    @JsonProperty("iname")
    private String iname;

    /**
     * 法人、负责人姓名
     */
    @JsonProperty("businessentity")
    private String businessentity;

    /**
     * 执行依据文号
     */
    @JsonProperty("gistid")
    private String gistid;

    /**
     * 省份地区
     */
    @JsonProperty("areaname")
    private String areaname;

    /**
     * 身份证号码/组织机构代码
     */
    @JsonProperty("cardnum")
    private String cardnum;

    /**
     * 法院
     */
    @JsonProperty("courtname")
    private String courtname;

    /**
     * 发布时间
     */
    @JsonProperty("publishdate")
    private Long publishdate;

    /**
     * 失信人类型，0代表人，1代表公司
     */
    @JsonProperty("type")
    private String type;

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
     * 案号
     */
    @JsonProperty("casecode")
    private String casecode;

    /**
     * 失信被执行人行为具体情形
     */
    @JsonProperty("disrupttypename")
    private String disrupttypename;
}
