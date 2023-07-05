package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/5 11:31
 * @version 1.0
 */
@Getter
@Setter
public class OrderValue {
    /**
     * lowerBound
     */
    @JsonProperty("lowerBound")
    private Money lowerBound;
}
