package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.vo.MoneyValuePayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author jadechiang
 * @since 2023/3/3 12:34
 */
@Getter
@Setter
public class InitiateRefundPayload {
    /**
     * object (RefundPayment)
     * Payment affected by refund operation.
     */
    @JsonProperty("payment")
    private IdPayload payment;
    /**
     * string
     * Enum: "REFUND" "COMPLAINT" "PRODUCT_NOT_AVAILABLE" "PAID_VALUE_TOO_LOW"
     * Reason for a payment refund.
     */
    @JsonProperty("reason")
    private String reason;
    /**
     * Array of objects (RefundLineItem) [ items ]
     * List of order's line items which can be refunded.
     */
    @JsonProperty("lineItems")
    private List<InitiateRefundLineItem> lineItems;
    /**
     * object
     * Payment refund for delivery.
     */
    @JsonProperty("delivery")
    private MoneyValuePayload delivery;
    /**
     * o
     * object
     * Payment refund for delivery.
     */
    @JsonProperty("overpaid")
    private MoneyValuePayload overpaid;
    /**
     * object
     * Payment refund for overpaid.
     */
    @JsonProperty("surcharges")
    private List<Surcharges> surcharges;
    /**
     * object
     * Payment refund for additional services.
     */
    @JsonProperty("additionalServices")
    private MoneyValuePayload additionalServices;
    /**
     * string <= 250 characters
     * Sellers optional justification for refund.
     */
    @JsonProperty("sellerComment")
    private String sellerComment;
}
