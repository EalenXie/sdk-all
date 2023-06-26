package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/10/21 11:33
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CancelOrderPayload {

    /**
     * 订单号
     */
    @JsonProperty("order_code")
    private String orderCode;
    /**
     * 截单原因
     */
    @JsonProperty("reason")
    private String reason;
}
