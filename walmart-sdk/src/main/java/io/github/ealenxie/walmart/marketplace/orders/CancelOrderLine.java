package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/6 10:21
 */
@Getter
@Setter
public class CancelOrderLine {
    /**
     * lineNumber
     */
    @JsonProperty("lineNumber")
    private String lineNumber;
    /**
     * orderLineStatuses
     */
    @JsonProperty("orderLineStatuses")
    private CancelOrderLineStatuses orderLineStatuses;
}
