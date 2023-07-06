package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/6 10:25
 */
@NoArgsConstructor
@Data
public class AcknowledgeOrdersResponse {


    /**
     * order
     */
    @JsonProperty("order")
    private AcknowledgeOrder order;
}
