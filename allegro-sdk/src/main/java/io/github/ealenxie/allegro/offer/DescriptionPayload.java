package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/3 14:01
 */
@NoArgsConstructor
@Data
public class DescriptionPayload {
    /**
     * translation
     */
    @JsonProperty("translation")
    private Translation translation;
}
