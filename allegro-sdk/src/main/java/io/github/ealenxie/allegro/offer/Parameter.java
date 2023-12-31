package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/29 15:51
 */
@Getter
@Setter
public class Parameter {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * rangeValue
     */
    @JsonProperty("rangeValue")
    private RangeValue rangeValue;
    /**
     * values
     */
    @JsonProperty("values")
    private List<String> values;
    /**
     * valuesIds
     */
    @JsonProperty("valuesIds")
    private List<String> valuesIds;
}
