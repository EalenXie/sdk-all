package io.github.ealenxie.allegro.setting;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/3 15:37
 * @version 1.0
 */
@Getter
@Setter
public class ConstraintCriteria {
    /**
     * country
     */
    @JsonProperty("country")
    private String country;
    /**
     * type
     */
    @JsonProperty("type")
    private String type;
    /**
     * deliveryMethods
     */
    @JsonProperty("deliveryMethods")
    private List<IdPayload> deliveryMethods;
}
