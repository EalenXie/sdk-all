package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/10 16:03
 */
@NoArgsConstructor
@Data
public class ShipDatePayload {

    /**
     * shipDate
     */
    @JsonProperty("shipDate")
    private String shipDate;
}
