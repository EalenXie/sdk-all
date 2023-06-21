package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhs
 * @since 2022年12月16日 0016 11 03
 */
@Getter
@Setter
public class LogisticsTraceInfo {
    /**
     * 物流编号，如BX110096003841234
     */
    @JsonProperty("logisticsId")
    private String logisticsId;
    /**
     * 订单编号
     */
    @JsonProperty("orderId")
    private Long orderId;
    /**
     * 物流单编号，如480330616596
     */
    @JsonProperty("logisticsBillNo")
    private String logisticsBillNo;
    /**
     * 物流跟踪步骤
     */
    @JsonProperty("logisticsSteps")
    private List<LogisticsStep> logisticsSteps;
}
