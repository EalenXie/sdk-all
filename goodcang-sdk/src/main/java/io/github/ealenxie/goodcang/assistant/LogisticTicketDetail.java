package io.github.ealenxie.goodcang.assistant;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.goodcang.vo.ListPayload;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/27 10:14
 */
@Getter
@Setter
public class LogisticTicketDetail {

    /**
     * 基本信息
     */
    @JsonProperty("base_info")
    private BaseInfo baseInfo;
    /**
     * 订单信息
     */
    @JsonProperty("order_info")
    private OrderInfo orderInfo;
    /**
     * 复查信息
     */
    @JsonProperty("recheck_info")
    private ListPayload<AppealPayload> recheckInfo;
    /**
     * 申诉信息
     */
    @JsonProperty("appeal_info")
    private ListPayload<AppealPayload> appealInfo;
    /**
     * 日志信息
     */
    @JsonProperty("log_info")
    private ListPayload<LogInfo> logInfo;
}
