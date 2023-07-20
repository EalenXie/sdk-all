package io.github.ealenxie.paypal.disputes;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/18 14:42
 */
@Getter
@Setter
public class DisputesMakeOfferPayload {

    /**
     * note
     */
    @JsonProperty("note")
    private String note;
    /**
     * offerType
     */
    @JsonProperty("offer_type")
    private String offerType;
    /**
     * offerAmount
     */
    @JsonProperty("offer_amount")
    private Money offerAmount;
}
