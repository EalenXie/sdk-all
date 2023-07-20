package io.github.ealenxie.winit.isp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/14 17:05
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderNoData {
    /**
     * ISP 订单号
     */
    @JsonProperty("orderNo")
    private String orderNo;
}
