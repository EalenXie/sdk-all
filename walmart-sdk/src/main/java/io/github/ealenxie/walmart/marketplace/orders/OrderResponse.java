package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/6 10:03
 */
@Getter
@Setter
public class OrderResponse {

    /**
     * order
     */
    @JsonProperty("order")
    private OrderPayload order;
}
