package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class ClassificationResponse {


    /**
     * classification
     */
    @JsonProperty("classification")
    private Classification classification;
    /**
     * conditions
     */
    @JsonProperty("conditions")
    private List<Conditions> conditions;
    /**
     * excludedDeliveryMethods
     */
    @JsonProperty("excludedDeliveryMethods")
    private List<IdPayload> excludedDeliveryMethods;
}
