package io.github.ealenxie.shopify.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentsRefundAttributesDTO {
    private String status;
    @JsonProperty("acquirer_reference_number")
    private String acquirerReferenceNumber;
}
