package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/4 17:12
 * @version 1.0
 */
@Getter
@Setter
public class OfferStats {
    /**
     * offer
     */
    @JsonProperty("offer")
    private Offer offer;
    /**
     * eventStatsTotal
     */
    @JsonProperty("eventStatsTotal")
    private List<EventStatsTotal> eventStatsTotal;
    /**
     * eventsPerDay
     */
    @JsonProperty("eventsPerDay")
    private List<EventsPerDay> eventsPerDay;
}
