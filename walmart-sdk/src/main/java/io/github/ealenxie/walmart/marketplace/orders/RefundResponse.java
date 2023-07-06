package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/6 10:13
 */
@NoArgsConstructor
@Data
public class RefundResponse {


    /**
     * order
     */
    @JsonProperty("order")
    private RefundOrder order;
}
