package io.github.ealenxie.alibaba.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月16日 0016 11 01
 */
@Getter
@Setter
public class GetLogisticsTraceInfo {
    /**
     * 该订单下的物流编号
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("logisticsId")
    private String logisticsId;
    /**
     * 订单号
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("orderId")
    private Long orderId;
    /**
     * 是1688业务还是icbu业务
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("webSite")
    private String webSite;
}
