package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class Sort {
    /**
     * value
     */
    @JsonProperty("value")
    private String value;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * order
     */
    @JsonProperty("order")
    private String order;
    /**
     * selected
     */
    @JsonProperty("selected")
    private Boolean selected;
}
