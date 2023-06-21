package io.github.ealenxie.shopify.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonIgnoreProperties(value = {"fraud_details"})
public class ChargeDTO {
    private String id;
    private String object;
    private int amount;
    @JsonProperty("application_fee")
    private String applicationFee;
    @JsonProperty("balance_transaction")
    private Object balanceTransaction;
    private boolean captured;
    private long created;
    private String currency;
    @JsonProperty("failure_code")
    private String failureCode;
    @JsonProperty("failure_message")
    private String failureMessage;
    @JsonProperty("fraud_details")
    private FraudDetailsDTO fraudDetails;
    private boolean livemode;
    private ChargeMetaDataDTO metadata;
    private OutcomeDTO outcome;
    private boolean paid;
    @JsonProperty("payment_intent")
    private String paymentIntent;
    @JsonProperty("payment_method")
    private String paymentMethod;
    @JsonProperty("payment_method_details")
    private PaymentMethodDetailsDTO paymentMethodDetails;
    private boolean refunded;
    private Object source;
    private String status;
    @JsonProperty("mit_params")
    private MitParamsDTO mitParams;
}
