package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/29 15:39
 */
@Getter
@Setter
public class Stock {
    /**
     * available
     */
    @JsonProperty("available")
    private Integer available;
    /**
     * sold
     */
    @JsonProperty("sold")
    private Integer sold;
}
