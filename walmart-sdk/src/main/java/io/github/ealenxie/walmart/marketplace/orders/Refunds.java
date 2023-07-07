package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/6 10:05
 */
@Getter
@Setter
public class Refunds {
    /**
     * refund
     */
    @JsonProperty("refund")
    private List<RefundPayload> refund;
}
