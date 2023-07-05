package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/5 9:48
 * @version 1.0
 */
@Getter
@Setter
public class BadgePayload {

    /**
     * campaign
     */
    @JsonProperty("campaign")
    private IdPayload campaign;
    /**
     * offer
     */
    @JsonProperty("offer")
    private IdPayload offer;
    /**
     * prices
     */
    @JsonProperty("prices")
    private Prices prices;
}
