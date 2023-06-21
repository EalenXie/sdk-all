package io.github.ealenxie.amazon.vo.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentExecutionDetail {
    @JsonProperty("Payment")
    private Money payment;
    @JsonProperty("PaymentMethod")
    private String paymentMethod;
}