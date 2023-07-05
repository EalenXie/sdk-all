package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/4 9:45
 */
@Getter
@Setter
public class ProductParameter {
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
     * type
     */
    @JsonProperty("type")
    private String type;
    /**
     * required
     */
    @JsonProperty("required")
    private Boolean required;
    /**
     * unit
     */
    @JsonProperty("unit")
    private String unit;
    /**
     * restrictions
     */
    @JsonProperty("restrictions")
    private Restrictions restrictions;
}
