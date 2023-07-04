package io.github.ealenxie.walmart.marketplace.orders;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie
 * @since 2022/08/24 10:33
 */
@Getter
@Setter
public class OrderLineStatuses {
    /**
     * orderLineStatus
     */
    private List<OrderLineStatus> orderLineStatus;
}
