package io.github.ealenxie.allegro.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author jadechiang
 * @since 2023/3/3 12:24
 */
@Getter
@Setter
public class InitiateRefundVO {
    /**
     * The payment refund identifier.
     */
    @JsonProperty("id")
    private String id;
    /**
     * object (RefundPayment)
     * Payment affected by refund operation.
     */
    @JsonProperty("payment")
    private Payment payment;
    /**
     * Enum: "REFUND" "COMPLAINT" "PRODUCT_NOT_AVAILABLE" "PAID_VALUE_TOO_LOW"
     * Reason for a payment refund.
     */
    @JsonProperty("reason")
    private String reason;
    /**
     * string
     * Enum: "SUCCESS" "CANCELED" "PARTIAL" "IN_PROGRESS" "VALIDATED" "VALIDATE_FAILED" "NEW"
     * Current status of payment refund.
     */
    @JsonProperty("status")
    private String status;
    /**
     * string <date-time>
     * Date and time when the refund was created provided in ISO 8601 format.
     */
    @JsonProperty("createdAt")
    private String createdAt;
    /**
     * object (MonetaryAmount)
     * Total amount for payment refund.
     */
    @JsonProperty("totalValue")
    private Money totalValue;
    /**
     * Array of objects (RefundLineItem) [ items ]
     * List of order's line items which can be refunded.
     */
    @JsonProperty("lineItems")
    private List<LineItems> lineItems;
    /**
     * object
     * Payment refund for delivery.
     */
    @JsonProperty("delivery")
    private Delivery delivery;
    /**
     * object
     * Payment refund for overpaid.
     */
    @JsonProperty("overpaid")
    private Overpaid overpaid;
    /**
     * Array of objects (PaymentsSurcharge) [ items ]
     * List of surcharges for payment which can be refunded.
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
