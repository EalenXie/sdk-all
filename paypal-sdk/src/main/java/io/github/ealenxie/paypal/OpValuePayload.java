package io.github.ealenxie.paypal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/18 13:20
 */
@Getter
@Setter
public class OpValuePayload<T> {
    /**
     * op
     */
    @JsonProperty("op")
    private String op;
    /**
     * path
     */
    @JsonProperty("path")
    private String path;
    /**
     * value
     */
    @JsonProperty("value")
    private T value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("from")
    private String from;
}
