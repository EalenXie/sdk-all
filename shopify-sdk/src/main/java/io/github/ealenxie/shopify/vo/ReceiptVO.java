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
public class ReceiptVO {

    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("ack")
    private String ack;
    @JsonProperty("correlation_id")
    private String correlationId;
    @JsonProperty("version")
    private String version;
    @JsonProperty("build")
    private String build;
    @JsonProperty("token")
    private String token;
    @JsonProperty("transaction_id")
    private String transactionId;
    @JsonProperty("parent_transaction_id")
    private String parentTransactionId;
    @JsonProperty("receipt_id")
    private String receiptId;
    @JsonProperty("transaction_type")
    private String transactionType;
    @JsonProperty("payment_type")
    private String paymentType;

    @JsonProperty("payment_date")
    private String paymentDate;
    @JsonProperty("gross_amount")
    private String grossAmount;
    @JsonProperty("gross_amount_currency_id")
    private String grossAmountCurrencyId;
    @JsonProperty("fee_amount")
    private String feeAmount;
    @JsonProperty("fee_amount_currency_id")
    private String feeAmountCurrencyId;
    @JsonProperty("tax_amount")
    private String taxAmount;
    @JsonProperty("tax_amount_currency_id")
    private String taxAmountCurrencyId;
    @JsonProperty("exchange_rate")
    private String exchangeRate;
    @JsonProperty("payment_status")
    private String paymentStatus;
    @JsonProperty("pending_reason")
    private String pendingReason;
    @JsonProperty("reason_code")
    private String reasonCode;
    @JsonProperty("protection_eligibility")
    private String protectionEligibility;
    @JsonProperty("protection_eligibility_type")
    private String protectionEligibilityType;
    @JsonProperty("pay_pal_account_id")
    private String payPalAccountId;
    @JsonProperty("secure_merchant_account_id")
    private String secureMerchantAccountId;
    @JsonProperty("success_page_redirect_requested")
    private String successPageRedirectRequested;
    @JsonProperty("coupled_payment_info")
    private String coupledPaymentInfo;
    @JsonProperty("PaymentInfo")
    private PaymentInfo paymentInfo;
}
