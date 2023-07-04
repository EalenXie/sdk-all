package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie
 * @since 2022/08/24 10:33
 */
@Getter
@Setter
public class OrderShipment {
    /**
     * orderLines
     */
    @JsonProperty("orderLines")
    private OrderLines orderLines;
}
