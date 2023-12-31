package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdNamePayload;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/3 10:05
 */
@Getter
@Setter
public class CreateOffersDiscountsPayload {
    /**
     * wholesalePriceList
     */
    @JsonProperty("wholesalePriceList")
    private IdNamePayload wholesalePriceList;
}
