package io.github.ealenxie.shopify.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChargeMetaDataDTO {
    @JsonProperty("order_transaction_id")
    private String orderTransactionId;
    @JsonProperty("payments_refund_id")
    private String paymentsRefundId;
}
