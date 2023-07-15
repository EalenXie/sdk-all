package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/15 13:55
 */
@NoArgsConstructor
@Data
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
