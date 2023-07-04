package io.github.ealenxie.winit.lma;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/4/21 15:00
 * @version 1.0
 */
@Getter
@Setter
public class OrderNoPayload {

    /**
     * Winit订单号
     */
    @JsonProperty("orderNo")
    private String orderNo;
}
