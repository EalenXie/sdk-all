package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/10 16:03
 */
@Getter
@Setter
public class ShipDatePayload {

    /**
     * shipDate
     */
    @JsonProperty("shipDate")
    private String shipDate;
}
