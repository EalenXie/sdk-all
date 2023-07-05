package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdNamePayload;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/5 10:03
 * @version 1.0
 */
@Getter
@Setter
public class Badges {
    /**
     * offer
     */
    @JsonProperty("offer")
    private IdPayload offer;
    /**
     * campaign
     */
    @JsonProperty("campaign")
    private IdNamePayload campaign;
    /**
     * publication
     */
    @JsonProperty("publication")
    private Publication publication;
    /**
     * prices
     */
    @JsonProperty("prices")
    private Prices prices;
    /**
     * process
     */
    @JsonProperty("process")
    private Process process;
}
