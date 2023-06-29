package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/29 11:19
 */
@Getter
@Setter
public class RefundLineItem {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * type
     */
    @JsonProperty("type")
    private String type;
    /**
     * quantity
     */
    @JsonProperty("quantity")
    private Integer quantity;
    /**
     * value
     */
    @JsonProperty("value")
    private Money value;
}
