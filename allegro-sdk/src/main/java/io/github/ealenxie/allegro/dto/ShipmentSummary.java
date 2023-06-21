package io.github.ealenxie.allegro.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShipmentSummary {
    /**
     * Indicates how many line items have tracking number specified
     * Enum：NONE、SOME、ALL
     */
    @JsonProperty("lineItemsSent")
    private String lineItemsSent;
}