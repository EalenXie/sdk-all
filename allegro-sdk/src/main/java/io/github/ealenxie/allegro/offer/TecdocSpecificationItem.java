package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/29 15:51
 */
@NoArgsConstructor
@Data
public class TecdocSpecificationItem {
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * values
     */
    @JsonProperty("values")
    private List<String> values;
}
