package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/6/29 15:39
 */
@NoArgsConstructor
@Data
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
