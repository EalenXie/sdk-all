package io.github.ealenxie.goodcang.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/25 12:46
 */
@Getter
@Setter
public class CostType {

    /**
     * 费用名称
     */
    @JsonProperty("cost_name")
    private String costName;
    /**
     * 费用编码
     */
    @JsonProperty("cost_code")
    private String costCode;
}
