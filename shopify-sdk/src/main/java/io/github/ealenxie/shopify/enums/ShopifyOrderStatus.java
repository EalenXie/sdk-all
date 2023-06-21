package io.github.ealenxie.shopify.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;


/**
 * 订单状态
 */
@Getter
@RequiredArgsConstructor
public enum ShopifyOrderStatus {

    /**
     * Show only authorized orders
     */
    AUTHORIZED("authorized"),
    /**
     * Show only pending orders
     */
    PENDING("pending"),
    /**
     * Show only paid orders
     */
    PAID("paid"),
    /**
     * Show only partially paid orders
     */
    PARTIALLY_PAID("partially_paid"),
    /**
     * Show only refunded orders
     */
    REFUNDED("refunded"),
    /**
     * Show only voided orders
     */
    VOIDED("voided"),
    /**
     * Show only partially refunded orders
     */
    PARTIALLY_REFUNDED("partially_refunded"),
    /**
     * Show orders of any financial status.
     */

    ANY("any"),
    /**
     * Show authorized and partially paid orders.
     */
    UNPAID("unpaid");

    private final String status;


    public String getStatus() {
        return this.status;
    }
}
