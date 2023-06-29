package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/29 16:39
 */
@NoArgsConstructor
@Data
public class Output {
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * errors
     */
    @JsonProperty("errors")
    private List<Errors> errors;
}
