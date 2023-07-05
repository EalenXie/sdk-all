package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/5 11:32
 */
@Getter
@Setter
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
