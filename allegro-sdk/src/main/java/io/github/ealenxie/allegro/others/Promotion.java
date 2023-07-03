package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class Promotion {
    /**
     * emphasized
     */
    @JsonProperty("emphasized")
    private Boolean emphasized;
    /**
     * bold
     */
    @JsonProperty("bold")
    private Boolean bold;
    /**
     * highlight
     */
    @JsonProperty("highlight")
    private Boolean highlight;
}
