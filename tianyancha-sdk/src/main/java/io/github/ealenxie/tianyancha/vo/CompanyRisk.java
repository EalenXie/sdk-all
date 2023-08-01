package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyRisk {
    /**
     * 公司id
     */
    @JsonProperty("companyId")
    private long companyId;

    /**
     * 公司名称
     */
    @JsonProperty("companyName")
    private String companyName;

    /**
     * 主键
     */
    @JsonProperty("id")
    private long id;

    /**
     * 风险标题
     */
    @JsonProperty("title")
    private String title;

    /**
     * 风险类型
     */
    @JsonProperty("type")
    private int type;

    /**
     * 该风险数量
     */
    @JsonProperty("riskCount")
    private int riskCount;

    /**
     * 风险描述
     */
    @JsonProperty("desc")
    private String desc;
}