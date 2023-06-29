package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/6/29 16:27
 */
@NoArgsConstructor
@Data
public class OfferEventsResponse {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * occurredAt
     */
    @JsonProperty("occurredAt")
    private String occurredAt;
    /**
     * type
     */
    @JsonProperty("type")
    private String type;
    /**
     * offer
     */
    @JsonProperty("offer")
    private EventOffer offer;
}
