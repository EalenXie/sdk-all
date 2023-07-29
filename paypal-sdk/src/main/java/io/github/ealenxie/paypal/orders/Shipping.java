package io.github.ealenxie.paypal.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/29 10:10
 */
@Getter
@Setter
public class Shipping {
    /**
     * address
     */
    @JsonProperty("address")
    private Address address;
}
