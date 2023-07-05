package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/4 10:37
 */
@Getter
@Setter
public class Filter {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * type
     */
    @JsonProperty("type")
    private String type;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * values
     */
    @JsonProperty("values")
    private List<Values> values;
    /**
     * minValue
     */
    @JsonProperty("minValue")
    private Integer minValue;
    /**
     * maxValue
     */
    @JsonProperty("maxValue")
    private Integer maxValue;
    /**
     * unit
     */
    @JsonProperty("unit")
    private String unit;
}
