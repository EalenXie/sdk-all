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
public class Validation {
    /**
     * errors
     */
    @JsonProperty("errors")
    private List<Errors> errors;
    /**
     * warnings
     */
    @JsonProperty("warnings")
    private List<Errors> warnings;
    /**
     * validatedAt
     */
    @JsonProperty("validatedAt")
    private String validatedAt;
}
