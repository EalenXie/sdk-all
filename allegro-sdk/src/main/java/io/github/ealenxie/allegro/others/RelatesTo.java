package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    private BaseId offer;
    /**
     * order
     */
    @JsonProperty("order")
    private BaseId order;
}
