package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/11 15:10
 */
@Getter
@Setter
public class ShipToAddressName {
    /**
     * completeName
     */
    @JsonProperty("completeName")
    private String completeName;
    /**
     * firstName
     */
    @JsonProperty("firstName")
    private String firstName;
    /**
     * lastName
     */
    @JsonProperty("lastName")
    private String lastName;
}
