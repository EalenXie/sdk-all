package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/4 14:01
 * @version 1.0
 */
@Getter
@Setter
public class CreateRefundPayload {
    /**
     * lineItem
     */
    @JsonProperty("lineItem")
    private List<IdPayload> lineItem;
    /**
     * quantity
     */
    @JsonProperty("quantity")
    private Integer quantity;
}
