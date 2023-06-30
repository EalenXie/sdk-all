package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/29 16:14
 */
@Getter
@Setter
public class Condition {
    /**
     * code
     */
    @JsonProperty("code")
    private String code;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * description
     */
    @JsonProperty("description")
    private String description;
    /**
     * fulfilled
     */
    @JsonProperty("fulfilled")
    private Boolean fulfilled;
    /**
     * passedDeliveryMethods
     */
    @JsonProperty("passedDeliveryMethods")
    private List<IdPayload> passedDeliveryMethods;
    /**
     * failedDeliveryMethods
     */
    @JsonProperty("failedDeliveryMethods")
    private List<IdPayload> failedDeliveryMethods;
}
