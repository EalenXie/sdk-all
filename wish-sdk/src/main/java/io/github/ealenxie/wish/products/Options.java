package io.github.ealenxie.wish.products;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/13 16:27
 */
@Getter
@Setter
public class Options {
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
}
