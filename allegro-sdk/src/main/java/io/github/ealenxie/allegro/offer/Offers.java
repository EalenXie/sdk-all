package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/5 13:26
 * @version 1.0
 */
@Getter
@Setter
public class Offers {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * quantity
     */
    @JsonProperty("quantity")
    private Integer quantity;
    /**
     * promotionEntryPoint
     */
    @JsonProperty("promotionEntryPoint")
    private Boolean promotionEntryPoint;
}
