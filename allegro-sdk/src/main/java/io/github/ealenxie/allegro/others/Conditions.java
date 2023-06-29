package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class Conditions {
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
     * value
     */
    @JsonProperty("value")
    private Double value;
    /**
     * threshold
     */
    @JsonProperty("threshold")
    private Double threshold;
    /**
     * fulfilled
     */
    @JsonProperty("fulfilled")
    private Boolean fulfilled;
    /**
     * required
     */
    @JsonProperty("required")
    private Boolean required;
}
