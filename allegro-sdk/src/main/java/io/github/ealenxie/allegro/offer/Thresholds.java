package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/5 11:31
 * @version 1.0
 */
@Getter
@Setter
public class Thresholds {
    /**
     * orderValue
     */
    @JsonProperty("orderValue")
    private OrderValue orderValue;
    /**
     * discount
     */
    @JsonProperty("discount")
    private Discount discount;
}
