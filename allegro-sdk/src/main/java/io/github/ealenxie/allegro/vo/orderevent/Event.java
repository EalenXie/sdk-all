package io.github.ealenxie.allegro.vo.orderevent;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 15:08
 */
@Getter
@Setter
public class Event {
    @JsonProperty("id")
    private String id;
    /**
     * 订单数据
     */
    @JsonProperty("order")
    private Order order;
    /**
     * 订单类型
     * “BOUGHT” “FILLED_IN” “READY_FOR_PROCESSING” “BUYER_CANCELLED” “FULFILLMENT_STATUS_CHANGED” “BUYER_MODIFIED” “AUTO_CANCELLED”
     * BOUGHT- 购买时未填写结帐表
     * FILLED_IN- 已填写结帐表但付款尚未完成，因此数据仍可能更改
     * READY_FOR_PROCESSING- 付款已完成。购买已准备好进行处理
     * BUYER_CANCELLED- 买家取消购买
     * FULFILLMENT_STATUS_CHANGED：履行状态已更改
     * BUYER_MODIFIED- 买家修改购买
     * AUTO_CANCELLED- Allegro 自动取消购买
     */
    @JsonProperty("type")
    private String type;
    /**
     * 时间
     */
    @JsonProperty("occurredAt")
    private String occurredAt;
}
