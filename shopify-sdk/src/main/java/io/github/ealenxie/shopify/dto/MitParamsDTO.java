package io.github.ealenxie.shopify.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MitParamsDTO {
    @JsonProperty("network_transaction_id")
    private String networkTransactionId;
}
