package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/14 16:11
 * @version 1.0
 */
@Getter
@Setter
public class InboundOrderResponse {

    /**
     * pageParams
     */
    @JsonProperty("pageParams")
    private PageParams pageParams;
    /**
     * orderList
     */
    @JsonProperty("orderList")
    private List<OrderPayload> orderList;
}
