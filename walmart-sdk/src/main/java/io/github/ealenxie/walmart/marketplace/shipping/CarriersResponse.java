package io.github.ealenxie.walmart.marketplace.shipping;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/7 11:05
 */
@NoArgsConstructor
@Data
public class CarriersResponse {
    /**
     * carriers
     */
    @JsonProperty("carriers")
    private List<Carrier> carriers;

    @JsonProperty("errors")
    private List<Error> errors;
}
