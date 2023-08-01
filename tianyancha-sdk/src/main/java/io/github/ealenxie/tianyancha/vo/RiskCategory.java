package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RiskCategory {
    /**
     * 该风险分类总数
     */
    @JsonProperty("total")
    private int total;

    /**
     * 风险标签
     */
    @JsonProperty("tag")
    private String tag;

    /**
     * 风险标题
     */
    @JsonProperty("title")
    private String title;

    /**
     * 公司风险列表
     */
    @JsonProperty("list")
    private List<CompanyRisk> list;

    /**
     * 风险类型
     */
    @JsonProperty("type")
    private int type;
}