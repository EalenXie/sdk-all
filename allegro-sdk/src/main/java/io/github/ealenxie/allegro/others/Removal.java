package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class Removal {
    /**
     * possibleTo
     */
    @JsonProperty("possibleTo")
    private String possibleTo;
    /**
     * request
     */
    @JsonProperty("request")
    private Request request;
}
