package io.github.ealenxie.shopify.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CardDTO {

    private String brand;
    private ChecksDTO checks;
    private String country;
    private String description;
    @JsonProperty("ds_transaction_id")
    private String dsTransactionId;
    @JsonProperty("exp_month")
    private int expMonth;
    @JsonProperty("exp_year")
    private int expYear;
    private String fingerprint;
    private String funding;
    private String iin;
    private String installments;
    private String issuer;
    private String last4;
    private String mandate;
    private String moto;
    private String network;
    @JsonProperty("network_transaction_id")
    private String networkTransactionId;
    @JsonProperty("three_d_secure")
    private Object threeDSecure;
    private Object wallet;
}
