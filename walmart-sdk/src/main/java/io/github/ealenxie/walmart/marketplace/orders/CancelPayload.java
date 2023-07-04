package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/21 14:11
 */
@Getter
@Setter
public class CancelPayload {

    @JsonProperty("orderCancellation")
    private OrderCancellation orderCancellation;
}
