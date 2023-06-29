package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/6/29 15:51
 */
@NoArgsConstructor
@Data
public class Discounts {
    /**
     * wholesalePriceList
     */
    @JsonProperty("wholesalePriceList")
    private IdPayload wholesalePriceList;
}
