package io.github.ealenxie.wish.variation;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/13 13:42
 * @version 1.0
 */
@Getter
@Setter
public class Attributes {
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * value
     */
    @JsonProperty("value")
    private List<String> value;
}
