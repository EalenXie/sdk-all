package io.github.ealenxie.wish.variation;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author create by sch  2023/7/13 13:45
 * @version 1.0
 */
@NoArgsConstructor
@Data
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
