package io.github.ealenxie.alibaba.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhs
 * @since 2022年12月16日 0016 13 48
 */
@Getter
@Setter
public class GetRefundReasonList {
    /**
     * 主订单id
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("orderId")
    private Long orderId;
    /**
     * 子订单id
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("orderEntryIds")
    private List<Long> orderEntryIds;
    /**
     * 货物状态
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("goodsStatus")
    private String goodsStatus;
}
