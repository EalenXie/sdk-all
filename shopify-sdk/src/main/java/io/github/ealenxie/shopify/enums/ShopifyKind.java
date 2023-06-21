package io.github.ealenxie.shopify.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author EalenXie
 * 是收款还是退款流水
 * @since 2022/08/10 8:55
 */
@Getter
@RequiredArgsConstructor
public enum ShopifyKind {
    /**
     * Money that the customer has agreed to pay. The authorization period can be between
     * 7 and 30 days (depending on your payment service)
     * while a store waits for a payment to be captured.
     */
    AUTHORIZATION("authorization"),
    /**
     * A transfer of money that was reserved during the authorization of a shop.
     */
    CAPTURE("capture"),
    /**
     * The authorization and capture of a payment performed in one single step
     */
    SALE("sale"),
    /**
     * The cancellation of a pending authorization or capture
     */
    VOID("void"),
    /**
     * The partial or full return of captured money to the customer.
     */
    REFUND("refund");

    private final String status;


    public String getStatus() {
        return this.status;
    }
}
