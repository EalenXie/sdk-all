package io.github.ealenxie.amazon.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderItem {
    /**
     * 订单项的唯一标识符
     */
    @JsonProperty("orderItemId")
    private String orderItemId;
    /**
     * 要更新装运状态的数量
     */
    @JsonProperty("quantity")
    private Integer quantity;
}