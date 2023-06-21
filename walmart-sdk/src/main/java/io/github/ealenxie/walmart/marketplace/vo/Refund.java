package io.github.ealenxie.walmart.marketplace.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/5/10 12:44
 */
@Getter
@Setter
public class Refund {
    @JsonProperty("refundComments")
    private String refundComments;
    @JsonProperty("refundCharges")
    private RefundCharges refundCharges;
}
