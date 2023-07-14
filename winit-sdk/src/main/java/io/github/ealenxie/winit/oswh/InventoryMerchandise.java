package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/14 14:26
 * @version 1.0
 */
@Getter
@Setter
public class InventoryMerchandise {
    /**
     * merchandiseCode
     */
    @JsonProperty("merchandiseCode")
    private String merchandiseCode;
    /**
     * quantity
     */
    @JsonProperty("quantity")
    private String quantity;
}
