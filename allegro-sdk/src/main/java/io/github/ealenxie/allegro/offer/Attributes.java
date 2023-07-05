package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/5 13:18
 */
@NoArgsConstructor
@Data
public class Attributes {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * values
     */
    @JsonProperty("values")
    private List<String> values;
}
