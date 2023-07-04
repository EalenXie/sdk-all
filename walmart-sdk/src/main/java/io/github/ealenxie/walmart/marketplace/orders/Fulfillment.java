package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie
 * @since 2022/08/04 12:37
 */
@Getter
@Setter
public class Fulfillment {
    @JsonProperty("shipMethod")
    private String shipMethod;
    @JsonProperty("fulfillmentOption")
    private String fulfillmentOption;
    @JsonProperty("pickUpDateTime")
    private Long pickUpDateTime;
}
