package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/3 10:05
 */
@NoArgsConstructor
@Data
public class Quantity {
    /**
     * value
     */
    @JsonProperty("value")
    private Integer value;
}
