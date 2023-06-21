package io.github.ealenxie.shopify.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChecksDTO {
    @JsonProperty("address_line1_check")
    private String addressLine1Check;
    @JsonProperty("address_postal_code_check")
    private String addressPostalCodeCheck;
    @JsonProperty("cvc_check")
    private String cvcCheck;
}
