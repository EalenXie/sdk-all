package io.github.ealenxie.paypal.referencedpayouts;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Link;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/7/25 15:25
 **/
@Getter
@Setter
public class ReferencedPayoutsResponse {
    /**
     * An array of referenced payouts items. For synchronous execution, the maximum number of items is 10.
     * If you include more than 10 items, the request is processed asynchronously no matter what the partner defined in the Prefer request header.
     */
    @JsonProperty("referenced_payouts")
    private List<ReferencedPayouts> referencedPayouts;
    /**
     * An array of request-related HATEOAS links.
     */
    @JsonProperty("links")
    private List<Link> links;
    /**
     * The funding instrument that receives the payout.
     */
    @JsonProperty("payout_directive")
    private PayoutDirective payoutDirective;
}

