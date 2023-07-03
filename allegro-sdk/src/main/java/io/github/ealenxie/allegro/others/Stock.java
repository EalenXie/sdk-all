package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class Stock {
    /**
     * unit
     */
    @JsonProperty("unit")
    private String unit;
    /**
     * available
     */
    @JsonProperty("available")
    private Integer available;
}
