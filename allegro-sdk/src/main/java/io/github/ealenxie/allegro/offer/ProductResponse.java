package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/3 10:24
 */
@NoArgsConstructor
@Data
public class ProductResponse {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * publication
     */
    @JsonProperty("publication")
    private PublishPayload publication;
    /**
     * parameters
     */
    @JsonProperty("parameters")
    private List<ParametersPayload> parameters;
}
