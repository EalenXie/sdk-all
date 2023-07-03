package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/3 11:02
 */
@Getter
@Setter
public class OfferProcessingStatusResponse {


    /**
     * offer
     */
    @JsonProperty("offer")
    private IdPayload offer;
    /**
     * operation
     */
    @JsonProperty("operation")
    private Operation operation;
}
