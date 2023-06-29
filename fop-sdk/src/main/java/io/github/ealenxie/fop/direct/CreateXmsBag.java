package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/22 12:39
 */
@Getter
@Setter
public class CreateXmsBag {
    /**
     * 随机值，无业务语义(必须保证每次请求都不一致，包括系统触发的重试请求，否则请求被拦截)
     */
    @JsonProperty("request_id")
    private String requestId;

    /**
     * 袋子重量（单位:g）
     */
    @JsonProperty("bag_weight")
    private Integer bagWeight;

    /**
     * 完成装袋时间(东8)
     */
    @JsonProperty("finish_bagging_time")
    private Long finishBaggingTime;

    /**
     * 袋子里单票数量
     */
    @JsonProperty("pieces")
    private Integer pieces;

    /**
     * 订单列表
     */
    @JsonProperty("order_list")
    private List<OrderWeightPayload> orderList;
}
