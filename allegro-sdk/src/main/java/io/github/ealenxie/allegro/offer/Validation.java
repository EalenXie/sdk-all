package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.AllegroError;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/29 15:51
 */
@Getter
@Setter
public class Validation {
    /**
     * errors
     */
    @JsonProperty("errors")
    private List<AllegroError> errors;
    /**
     * warnings
     */
    @JsonProperty("warnings")
    private List<AllegroError> warnings;
    /**
     * validatedAt
     */
    @JsonProperty("validatedAt")
    private String validatedAt;
}
