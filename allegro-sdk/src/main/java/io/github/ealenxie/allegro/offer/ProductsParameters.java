package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/4 10:37
 */
@NoArgsConstructor
@Data
public class ProductsParameters {
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
    /**
     * valuesLabels
     */
    @JsonProperty("valuesLabels")
    private List<String> valuesLabels;
    /**
     * unit
     */
    @JsonProperty("unit")
    private String unit;
    /**
     * options
     */
    @JsonProperty("options")
    private Options options;








}
