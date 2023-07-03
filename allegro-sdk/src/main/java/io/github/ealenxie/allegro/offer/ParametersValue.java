package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/3 14:25
 */
@NoArgsConstructor
@Data
public class ParametersValue {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * oneOfValueIds
     */
    @JsonProperty("oneOfValueIds")
    private List<String> oneOfValueIds;
}
