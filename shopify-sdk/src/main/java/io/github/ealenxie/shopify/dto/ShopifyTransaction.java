package io.github.ealenxie.shopify.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ShopifyTransaction {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("type")
    private String type;
    @JsonProperty("test")
    private Boolean test;
    @JsonProperty("payout_id")
    private Long payoutId;
    @JsonProperty("payout_status")
    private String payoutStatus;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("amount")
    private BigDecimal amount;
    @JsonProperty("fee")
    private BigDecimal fee;
    @JsonProperty("net")
    private BigDecimal net;
    @JsonProperty("source_id")
    private Long sourceId;
    @JsonProperty("source_type")
    private String sourceType;
    @JsonProperty("source_order_id")
    private Long sourceOrderId;
    @JsonProperty("source_order_transaction_id")
    private Long sourceOrderTransactionId;
    @JsonProperty("processed_at")
    private String processedAt;
}