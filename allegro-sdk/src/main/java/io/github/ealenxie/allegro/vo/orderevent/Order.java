package io.github.ealenxie.allegro.vo.orderevent;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    private Seller seller;
    @JsonProperty("buyer")
    private Buyer buyer;
    @JsonProperty("lineItems")
    private List<LineItem> lineItems;
    @JsonProperty("checkoutForm")
    private CheckoutForm checkoutForm;
}
