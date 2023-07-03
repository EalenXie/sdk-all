package io.github.ealenxie.allegro.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/3 9:48
 * @version 1.0
 */
@Setter
@Getter
public class Quantity {
    /**
     * onOffer
     */
    @JsonProperty("onOffer")
    private Integer onOffer;
    /**
     * available
     */
    @JsonProperty("available")
    private Integer available;
    /**
     * onOrder
     */
    @JsonProperty("onOrder")
    private Integer onOrder;
    /**
     * onHold
     */
    @JsonProperty("onHold")
    private Integer onHold;
}
