package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/29 16:13
 */
@Getter
@Setter
public class SmartOfferResponse {

    /**
     * classification
     */
    @JsonProperty("classification")
    private Classify classification;
    /**
     * scheduledForReclassification
     */
    @JsonProperty("scheduledForReclassification")
    private Boolean scheduledForReclassification;
    /**
     * smartDeliveryMethods
     */
    @JsonProperty("smartDeliveryMethods")
    private List<IdPayload> smartDeliveryMethods;
    /**
     * conditions
     */
    @JsonProperty("conditions")
    private List<Condition> conditions;
}
