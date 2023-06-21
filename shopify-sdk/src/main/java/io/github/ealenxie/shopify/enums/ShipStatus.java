package io.github.ealenxie.shopify.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author EalenXie
 * @since 2022/10/13 20:43
 */
@Getter
@RequiredArgsConstructor
public enum ShipStatus {
    /**
     * The fulfillment order is ready for fulfillment.
     */
    OPEN("open"),
    /**
     * The fulfillment order is being processed.
     */
    IN_PROGRESS("in_progress"),
    /**
     * The fulfillment order is deferred and will be ready for fulfillment after the datetime specified in . fulfill_at
     */
    SCHEDULED("scheduled"),
    /**
     * The fulfillment order has been cancelled by the merchant.
     */
    CANCELLED("cancelled"),
    /**
     * The fulfillment order is on hold. The fulfillment process can't be initiated until the hold on the fulfillment order is released.
     */
    ON_HOLD("on_hold"),
    /**
     * The fulfillment order cannot be completed as requested.
     */
    INCOMPLETE("incomplete"),
    /**
     * The fulfillment order has been completed and closed.
     */
    CLOSED("closed");


    private final String status;


    public String getStatus() {
        return this.status;
    }
}
