package io.github.ealenxie.allegro.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/18 13:24
 */
@Getter
@Setter
public class OrderEventQueryParams {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String from;
    /**
     * BOUGHT: 购买时不填写结帐单
     * FILLED_IN: 结帐表格已填写，但付款尚未完成，因此数据仍可能更改
     * READY_FOR_PROCESSING: 付款完成。购买已准备好进行处理
     * BUYER_CANCELLED: 购买被买家取消
     * FULFILLMENT_STATUS_CHANGED：履行状态已更改
     * AUTO_CANCELLED: Allegro 自动取消购买。
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String type;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String limit;
}
