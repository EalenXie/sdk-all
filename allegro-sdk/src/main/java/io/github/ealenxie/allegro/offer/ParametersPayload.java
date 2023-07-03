package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/3 10:05
 */
@Getter
@Setter
public class ParametersPayload {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
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
