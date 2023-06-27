package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 17:14
 */
@Getter
@Setter
public class PlanOrderCodePayload {

    /**
     * 计划单号
     */
    @JsonProperty("plan_order_code")
    private String planOrderCode;
}
