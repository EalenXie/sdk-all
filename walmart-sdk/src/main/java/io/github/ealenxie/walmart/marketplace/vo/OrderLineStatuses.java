package io.github.ealenxie.walmart.marketplace.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie
 * @since 2022/08/04 12:33
 */
@Getter
@Setter
public class OrderLineStatuses {
    @JsonProperty("orderLineStatus")
    private List<OrderLineStatus> orderLineStatus;
}
