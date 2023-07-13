package io.github.ealenxie.wish.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 15:47
 */
@Getter
@Setter
public class FulfillmentRequirements {
    @JsonProperty("expected_ship_time")
    private String expectedShipTime;
    @JsonProperty("expected_delivery_time")
    private String expectedDeliveryTime;
}
