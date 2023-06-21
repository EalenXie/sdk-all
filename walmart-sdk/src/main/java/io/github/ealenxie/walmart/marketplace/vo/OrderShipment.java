package io.github.ealenxie.walmart.marketplace.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 15:39
 */
@Getter
@Setter
public class OrderShipment {
    @JsonProperty("orderLines")
    private OrderLines orderLines;
}
