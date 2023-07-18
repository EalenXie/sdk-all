package io.github.ealenxie.paypal.disputes;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Money;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/18 13:55
 */
@NoArgsConstructor
@Data
public class Offer {
    /**
     * buyerRequestedAmount
     */
    @JsonProperty("buyer_requested_amount")
    private Money buyerRequestedAmount;
    /**
     * offerType
     */
    @JsonProperty("offer_type")
    private String offerType;
    /**
     * history
     */
    @JsonProperty("history")
    private History history;
}
