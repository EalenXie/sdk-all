package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/4 9:45
 */
@NoArgsConstructor
@Data
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
