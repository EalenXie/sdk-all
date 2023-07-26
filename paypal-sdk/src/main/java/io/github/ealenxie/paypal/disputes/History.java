package io.github.ealenxie.paypal.disputes;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/18 13:55
 */
@Getter
@Setter
public class History {
    /**
     * offerTime
     */
    @JsonProperty("offer_time")
    private String offerTime;
    /**
     * actor
     */
    @JsonProperty("actor")
    private String actor;
    /**
     * eventType
     */
    @JsonProperty("event_type")
    private String eventType;
    /**
     * offerType
     */
    @JsonProperty("offer_type")
    private String offerType;
    /**
     * offerAmount
     */
    @JsonProperty("offer_amount")
    private Money offerAmount;
    /**
     * notes
     */
    @JsonProperty("notes")
    private String notes;
    /**
     * disputeLifeCycleStage
     */
    @JsonProperty("dispute_life_cycle_stage")
    private String disputeLifeCycleStage;
}
