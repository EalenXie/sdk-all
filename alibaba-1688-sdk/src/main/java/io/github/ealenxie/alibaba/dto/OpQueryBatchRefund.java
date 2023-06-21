package io.github.ealenxie.alibaba.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2022/12/16 13:31
 */
@Getter
@Setter
public class OpQueryBatchRefund {
    /**
     * 订单id
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("orderId")
    private String orderId;
    /**
     * 1：活动；3:退款成功（只支持退款中和退款成功）
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("queryType")
    private String queryType;
}
