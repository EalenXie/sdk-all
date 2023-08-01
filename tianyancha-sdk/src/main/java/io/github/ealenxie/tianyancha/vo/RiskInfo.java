package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RiskInfo {
    /**
     * 总数
     */
    @JsonProperty("count")
    private int count;

    /**
     * 风险分类名称
     */
    @JsonProperty("name")
    private String name;

    /**
     * 风险列表
     */
    @JsonProperty("list")
    private List<RiskCategory> list;
}