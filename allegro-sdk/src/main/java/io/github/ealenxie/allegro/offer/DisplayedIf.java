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
public class DisplayedIf {
    /**
     * parametersWithValue
     */
    @JsonProperty("parametersWithValue")
    private List<ParametersValue> parametersWithValue;
    /**
     * parametersWithoutValue
     */
    @JsonProperty("parametersWithoutValue")
    private List<ParametersValue> parametersWithoutValue;
}
