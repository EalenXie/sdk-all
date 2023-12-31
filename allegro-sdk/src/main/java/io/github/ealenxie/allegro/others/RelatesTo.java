package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Getter;
import lombok.Setter;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class RelatesTo {
    /**
     * offer
     */
    @JsonProperty("offer")
    private IdPayload offer;
    /**
     * order
     */
    @JsonProperty("order")
    private IdPayload order;
}
