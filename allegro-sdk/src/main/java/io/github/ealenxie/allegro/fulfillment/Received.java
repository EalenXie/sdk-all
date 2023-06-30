package io.github.ealenxie.allegro.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/6/30 17:29
 * @version 1.0
 */
@Setter
@Getter
public class Received {
    /**
     * quantity
     */
    @JsonProperty("quantity")
    private Integer quantity;
    /**
     * receivedType
     */
    @JsonProperty("receivedType")
    private String receivedType;
    /**
     * reasonCode
     */
    @JsonProperty("reasonCode")
    private String reasonCode;
}
