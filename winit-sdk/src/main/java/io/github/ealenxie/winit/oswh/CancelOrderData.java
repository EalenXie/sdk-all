package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/15 13:55
 */
@Getter
@Setter
public class CancelOrderData {
    /**
     * orderNo
     */
    @JsonProperty("orderNo")
    private String orderNo;
    /**
     * cancelReason
     */
    @JsonProperty("cancelReason")
    private String cancelReason;
}
