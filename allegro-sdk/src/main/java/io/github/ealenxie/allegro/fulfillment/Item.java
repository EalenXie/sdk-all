package io.github.ealenxie.allegro.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/6/30 15:11
 * @version 1.0
 */
@Getter
@Setter
public class Item {
    /**
     * product
     */
    @JsonProperty("product")
    private IdPayload product;
    /**
     * quantity
     */
    @JsonProperty("quantity")
    private Integer quantity;
}
