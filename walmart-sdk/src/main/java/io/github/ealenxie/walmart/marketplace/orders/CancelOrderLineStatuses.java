package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/6 10:21
 */
@NoArgsConstructor
@Data
public class CancelOrderLineStatuses {
    /**
     * orderLineStatus
     */
    @JsonProperty("orderLineStatus")
    private List<CancelOrderLineStatus> orderLineStatus;
}