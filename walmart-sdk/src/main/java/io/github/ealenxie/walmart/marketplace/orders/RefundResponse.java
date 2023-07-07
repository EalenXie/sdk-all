package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/6 10:13
 */
@Getter
@Setter
public class RefundResponse {


    /**
     * order
     */
    @JsonProperty("order")
    private RefundOrder order;
}
