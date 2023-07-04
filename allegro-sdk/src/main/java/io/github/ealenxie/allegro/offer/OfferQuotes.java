package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import io.github.ealenxie.allegro.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/4 15:52
 * @version 1.0
 */
@Getter
@Setter
public class OfferQuotes {
    /**
     * enabled
     */
    @JsonProperty("enabled")
    private Boolean enabled;
    /**
     * fee
     */
    @JsonProperty("fee")
    private Money fee;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * nextDate
     */
    @JsonProperty("nextDate")
    private String nextDate;
    /**
     * offer
     */
    @JsonProperty("offer")
    private IdPayload offer;
    /**
     * type
     */
    @JsonProperty("type")
    private String type;
}
