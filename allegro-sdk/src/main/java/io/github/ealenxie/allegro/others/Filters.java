package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class Filters {
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
