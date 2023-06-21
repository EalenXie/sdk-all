package io.github.ealenxie.alibaba.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2022/12/16 13:11
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TradeFeedbackParam {
    /**
     * 留言
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("feedback")
    private String feedback;
    /**
     * 订单ID
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("orderId")
    private String orderId;
}
