package io.github.ealenxie.paypal.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/5/7 10:52
 */
@Getter
@Setter
public class ReferencedPayoutsItems {
    @JsonProperty("referenced_payouts")
    private List<ReferencedPayouts> referencedPayouts;
    @JsonProperty("payout_directive")
    private PayoutDirective payoutDirective;
    @JsonProperty("links")
    private List<Link> links;
}
