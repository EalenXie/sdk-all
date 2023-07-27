package io.github.ealenxie.paypal.referencedpayouts;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/7/25 14:40
 **/
@Getter
@Setter
public class ReferencedPayoutsPayload {
    /**
     * An array of referenced payouts items. For synchronous execution, the maximum number of items is 10.
     * If you include more than 10 items, the request is processed asynchronously no matter what the partner defined in the Prefer request header.
     */
    @JsonProperty("referenced_payouts")
    private List<ReferencedPayouts> referencedPayouts;
    /**
     * The funding instrument that receives the payout.
     */
    @JsonProperty("payout_directive")
    private PayoutDirective payoutDirective;
}

