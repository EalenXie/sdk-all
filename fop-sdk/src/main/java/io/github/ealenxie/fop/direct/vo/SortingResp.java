package io.github.ealenxie.fop.direct.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/24 18:04
 */
@Getter
@Setter
public class SortingResp {

    @JsonProperty("ruleCode")
    private String ruleCode;
    @JsonProperty("ruleName")
    private String ruleName;
    @JsonProperty("sortingId")
    private Integer sortingId;
}
