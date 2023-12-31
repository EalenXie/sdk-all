package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/4 10:37
 */
@Getter
@Setter
public class Values {
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * value
     */
    @JsonProperty("value")
    private String value;
    /**
     * idSuffix
     */
    @JsonProperty("idSuffix")
    private String idSuffix;
    /**
     * count
     */
    @JsonProperty("count")
    private Integer count;
    /**
     * selected
     */
    @JsonProperty("selected")
    private Boolean selected;
}
