package io.github.ealenxie.shopify.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MetadataDTO {
    @JsonProperty("shop_id")
    private String shopId;
    @JsonProperty("shop_name")
    private String shopName;
    @JsonProperty("transaction_fee_total_amount")
    private String transactionFeeTotalAmount;
    @JsonProperty("transaction_fee_tax_amount")
    private String transactionFeeTaxAmount;
    @JsonProperty("payments_charge_id")
    private String paymentsChargeId;
    @JsonProperty("order_transaction_id")
    private String orderTransactionId;
    @JsonProperty("manual_entry")
    private String manualEntry;
    @JsonProperty("order_id")
    private String orderId;
    @JsonProperty("email")
    private String email;
}
