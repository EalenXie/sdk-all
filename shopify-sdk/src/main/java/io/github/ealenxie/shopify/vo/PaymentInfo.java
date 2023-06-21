package io.github.ealenxie.shopify.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie
 * @since 2022/05/18 13:30
 */
@Getter
@Setter
public class PaymentInfo {
    @JsonProperty("TransactionID")
    private String transactionID;
    @JsonProperty("ParentTransactionID")
    private String parentTransactionID;
    @JsonProperty("ReceiptID")
    private String receiptID;
    @JsonProperty("TransactionType")
    private String transactionType;
    @JsonProperty("PaymentType")
    private String paymentType;
    @JsonProperty("PaymentDate")
    private String paymentDate;
    @JsonProperty("GrossAmount")
    private String grossAmount;
    @JsonProperty("FeeAmount")
    private String feeAmount;
    @JsonProperty("TaxAmount")
    private String taxAmount;
    @JsonProperty("ExchangeRate")
    private Object exchangeRate;
    @JsonProperty("PaymentStatus")
    private String paymentStatus;
    @JsonProperty("PendingReason")
    private String pendingReason;
    @JsonProperty("ReasonCode")
    private String reasonCode;
    @JsonProperty("ProtectionEligibility")
    private String protectionEligibility;
    @JsonProperty("ProtectionEligibilityType")
    private String protectionEligibilityType;
    @JsonProperty("SellerDetails")
    private SellerDetails sellerDetails;
}
