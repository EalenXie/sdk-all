package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/5 11:32
 */
@NoArgsConstructor
@Data
public class OfferTagPayload {


    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * hidden
     */
    @JsonProperty("hidden")
    private Boolean hidden;
}
