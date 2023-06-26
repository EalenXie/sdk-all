package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 13:56
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OrderCodePayload {
    /**
     * 订单号
     */
    @JsonProperty("order_code")
    private String orderCode;
}
