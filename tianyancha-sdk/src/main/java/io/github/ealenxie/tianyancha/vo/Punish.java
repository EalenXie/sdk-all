package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Punish {
    /**
     * 作出行政处罚决定机关名称
     */
    @JsonProperty("departmentName")
    private String departmentName;

    /**
     * 违法行为类型
     */
    @JsonProperty("type")
    private String type;

    /**
     * 行政处罚内容
     */
    @JsonProperty("content")
    private String content;

    /**
     * 法定代表人（负责人）姓名
     */
    @JsonProperty("legalPersonName")
    private String legalPersonName;

    /**
     * 作出行政处罚决定日期
     */
    @JsonProperty("decisionDate")
    private String decisionDate;

    /**
     * 注册号
     */
    @JsonProperty("regNumber")
    private String regNumber;

    /**
     * 行政处罚决定书文号
     */
    @JsonProperty("punishNumber")
    private String punishNumber;

    /**
     * 公司名称
     */
    @JsonProperty("name")
    private String name;

    /**
     * 表id
     */
    @JsonProperty("id")
    private Long id;

    /**
     * 来源名称
     */
    @JsonProperty("sourceName")
    private String sourceName;
}
