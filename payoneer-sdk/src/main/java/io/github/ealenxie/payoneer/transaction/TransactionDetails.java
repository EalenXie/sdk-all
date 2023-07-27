package io.github.ealenxie.payoneer.transaction;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/31 13:25
 */
@Getter
@Setter
public class TransactionDetails {
    @JsonProperty("payment_date")
    private String paymentDate;
    private String fee;
    @JsonProperty("fee_currency")
    private String feeCurrency;
    @JsonProperty("payment_description")
    private String paymentDescription;
    @JsonProperty("amount_charged")
    private String amountCharged;
    @JsonProperty("amount_charged_currency")
    private String amountChargedCurrency;
    @JsonProperty("payee_id")
    private String payeeId;
    @JsonProperty("transfer_amount")
    private String transferAmount;
    @JsonProperty("transfer_amount_currency")
    private String transferAmountCurrency;
    /**
     * 汇率
     */
    @JsonProperty("transfer_fx_rate")
    private String transferFxRate;
    @JsonProperty("transfer_source_currency")
    private String transferSourceCurrency;
    @JsonProperty("transfer_target_currency")
    private String transferTargetCurrency;
    @JsonProperty("payment_reference")
    private String paymentReference;
    @JsonProperty("recipient_name")
    private String recipientName;
    @JsonProperty("recipient_email")
    private String recipientEmail;
    @JsonProperty("batch_id")
    private String batchId;
    @JsonProperty("receiving_account_id")
    private String receivingAccountId;
    @JsonProperty("beneficiary")
    private String beneficiary;
    /**
     * 备注
     */
    @JsonProperty("note")
    private String note;
}
