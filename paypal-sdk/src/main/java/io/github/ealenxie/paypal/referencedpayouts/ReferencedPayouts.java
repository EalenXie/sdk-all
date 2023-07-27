package io.github.ealenxie.paypal.referencedpayouts;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Link;
import io.github.ealenxie.paypal.Money;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/5/7 10:53
 */
@Getter
@Setter
public class ReferencedPayouts {
    @JsonProperty("item_id")
    private String itemId;
    @JsonProperty("processing_state")
    private ProcessingState processingState;
    @JsonProperty("reference_id")
    private String referenceId;
    @JsonProperty("reference_type")
    private String referenceType;
    @JsonProperty("payout_amount")
    private Money payoutAmount;
    @JsonProperty("payout_destination")
    private String payoutDestination;
    @JsonProperty("payout_transaction_id")
    private String payoutTransactionId;
    @JsonProperty("disbursement_transaction_id")
    private String disbursementTransactionId;
    @JsonProperty("external_merchant_id")
    private String externalMerchantId;
    @JsonProperty("external_reference_id")
    private String externalReferenceId;
    @JsonProperty("invoice_id")
    private String invoiceId;
    @JsonProperty("custom")
    private String custom;
    @JsonProperty("payee_email")
    private String payeeEmail;
    @JsonProperty("links")
    private List<Link> links;
}
