package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Check {
    /**
     * 类型
     */
    @JsonProperty("checkType")
    private String checkType;

    /**
     * 检查实施机关
     */
    @JsonProperty("checkOrg")
    private String checkOrg;

    /**
     * 备注
     */
    @JsonProperty("remark")
    private String remark;

    /**
     * 表id
     */
    @JsonProperty("id")
    private Number id;

    /**
     * 检查日期
     */
    @JsonProperty("checkDate")
    private String checkDate;

    /**
     * 结果
     */
    @JsonProperty("checkResult")
    private String checkResult;
}