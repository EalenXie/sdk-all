package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie
 * @since 2022/08/24 10:33
 */
@Getter
@Setter
public class OrderLine {
    /**
     * lineNumber
     */
    private String lineNumber;
    /**
     * intentToCancelOverride
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean intentToCancelOverride;
    /**
     * sellerOrderId
     */
    private String sellerOrderId;
    /**
     * orderLineStatuses
     */
    private OrderLineStatuses orderLineStatuses;
}
