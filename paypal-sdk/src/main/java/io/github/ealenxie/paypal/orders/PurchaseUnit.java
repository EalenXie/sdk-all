package io.github.ealenxie.paypal.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/24 15:27
 */
@Getter
@Setter
public class PurchaseUnit {
    /**
     * referenceId
     */
    @JsonProperty("reference_id")
    private String referenceId;
    /**
     * amount
     */
    @JsonProperty("amount")
    private Money amount;
}
