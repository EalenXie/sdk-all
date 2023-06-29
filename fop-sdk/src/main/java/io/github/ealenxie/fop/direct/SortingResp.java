package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/24 18:04
 */
@Getter
@Setter
public class SortingResp {
    /**
     * 分拣规则编码
     */
    @JsonProperty("ruleCode")
    private String ruleCode;

    /**
     * 分拣规则名称
     */
    @JsonProperty("ruleName")
    private String ruleName;

    /**
     * 分拣规则id
     */
    @JsonProperty("sortingId")
    private Integer sortingId;
}
