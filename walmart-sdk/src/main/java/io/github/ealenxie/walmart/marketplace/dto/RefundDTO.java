package io.github.ealenxie.walmart.marketplace.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.walmart.marketplace.vo.OrderRefund;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/21 13:40
 */
@Getter
@Setter
public class RefundDTO {

    @JsonProperty("orderRefund")
    private OrderRefund orderRefund;
}
