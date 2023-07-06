package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/6 10:02
 */
@NoArgsConstructor
@Data
public class ShipmentOrderLines {
    /**
     * orderLine
     */
    @JsonProperty("orderLine")
    private List<ShipmentOrderLine> orderLine;
}