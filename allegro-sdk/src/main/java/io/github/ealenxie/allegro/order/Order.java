package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/3/24 15:08
 */
@Getter
@Setter
public class Order {
    @JsonProperty("seller")
    private IdPayload seller;
    @JsonProperty("buyer")
    private OrderBuyer buyer;
    @JsonProperty("lineItems")
    private List<OrderLineItem> lineItems;
    @JsonProperty("checkoutForm")
    private OrderEventCheckoutForm checkoutForm;
}
