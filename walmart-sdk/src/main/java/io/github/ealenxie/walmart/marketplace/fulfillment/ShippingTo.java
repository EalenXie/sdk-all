package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/10 11:23
 */
@NoArgsConstructor
@Data
public class ShippingTo {
    /**
     * contact
     */
    @JsonProperty("contact")
    private ShippingToContact contact;
    /**
     * address
     */
    @JsonProperty("address")
    private Address address;
}
