package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/6 10:13
 */
@Getter
@Setter
public class RefundOrderLinesResponse {
    /**
     * orderLine
     */
    @JsonProperty("orderLine")
    private List<RefundOrderLineResponse> orderLine;
}
