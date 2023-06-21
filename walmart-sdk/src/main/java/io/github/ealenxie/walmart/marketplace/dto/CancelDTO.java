package io.github.ealenxie.walmart.marketplace.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.vo.OrderCancellation;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/21 14:11
 */
@Getter
@Setter
public class CancelDTO {

    @JsonProperty("orderCancellation")
    private OrderCancellation orderCancellation;
}
