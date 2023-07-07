package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/6 10:25
 */
@Getter
@Setter
public class AcknowledgeOrdersResponse {


    /**
     * order
     */
    @JsonProperty("order")
    private AcknowledgeOrder order;
}
