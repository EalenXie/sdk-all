package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/6 10:04
 */
@NoArgsConstructor
@Data
public class OrderRefundPayload {

    /**
     * orderRefund
     */
    @JsonProperty("orderRefund")
    private OrderRefund orderRefund;
}
