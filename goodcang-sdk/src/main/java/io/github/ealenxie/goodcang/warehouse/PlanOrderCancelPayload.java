package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 17:26
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlanOrderCancelPayload {

    /**
     * 计划单号
     */
    @JsonProperty("plan_order_code")
    private String planOrderCode;
    /**
     * 取消原因
     */
    @JsonProperty("reason")
    private String reason;
}
