package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/6 10:03
 */
@NoArgsConstructor
@Data
public class OrderLines {
    /**
     * orderLine
     */
    @JsonProperty("orderLine")
    private List<OrderLine> orderLine;
}
