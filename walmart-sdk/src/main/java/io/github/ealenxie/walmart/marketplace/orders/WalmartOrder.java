package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie
 * @since 2022/08/12 11:09
 */
@Getter
@Setter
public class WalmartOrder {

    @JsonProperty("order")
    private Order order;
}
