package io.github.ealenxie.allegro.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author 无敌暴龙战士
 * @since 2023/3/3 12:34
 */
@Getter
@Setter
public class InitiateRefundDTO {
    /**
     * object (RefundPayment)
     * Payment affected by refund operation.
     */
    @JsonProperty("payment")
    private Payment payment;
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
    private List<LineItem> lineItems;
    /**
     * object
     * Payment refund for delivery.
     */
    @JsonProperty("delivery")
    private Delivery delivery;
    /**
     * o
     * object
     * Payment refund for delivery.
     */
    @JsonProperty("overpaid")
    private Overpaid overpaid;
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
    private AdditionalServices additionalServices;
    /**
     * string <= 250 characters
     * Sellers optional justification for refund.
     */
    @JsonProperty("sellerComment")
    private String sellerComment;
}
