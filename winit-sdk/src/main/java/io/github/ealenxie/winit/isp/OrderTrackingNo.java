package io.github.ealenxie.winit.isp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/14 16:56
 */
@Getter
@Setter
public class OrderTrackingNo {

    /**
     * winit订单号
     */
    @JsonProperty("orderNo")
    private String orderNo;
    /**
     * 跟踪号
     */
    @JsonProperty("trackingNo")
    private String trackingNo;
}
