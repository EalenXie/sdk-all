package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/30 9:50
 */
@Getter
@Setter
public class OfferCriteria {
    /**
     * offers
     */
    @JsonProperty("offers")
    private List<IdPayload> offers;
    /**
     * type
     */
    @JsonProperty("type")
    private String type;
}
