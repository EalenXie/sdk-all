package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/5/10 12:45
 */
@Getter
@Setter
public class OrderCancellation {
    @JsonProperty("orderLines")
    private OrderLines orderLines;
}
