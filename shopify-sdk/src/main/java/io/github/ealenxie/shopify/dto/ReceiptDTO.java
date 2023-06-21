package io.github.ealenxie.shopify.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ReceiptDTO {
    private String id;
    private BigDecimal amount;
    @JsonProperty("balance_transaction")
    private Object balanceTransaction;
    private ChargeDTO charge;
    private String object;
    private String reason;
    private String status;
    private long created;
    private String currency;
    private MetadataDTO metadata;
    @JsonProperty("payment_method_details")
    private PaymentMethodDetailsDTO paymentMethodDetails;
    @JsonProperty("mit_params")
    private MetadataDTO mitParams;
}
