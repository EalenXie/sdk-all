package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/3 14:25
 */
@Getter
@Setter
public class RequiredIf {
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
