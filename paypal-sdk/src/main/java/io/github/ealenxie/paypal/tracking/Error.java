package io.github.ealenxie.paypal.tracking;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/19 11:26
 */
@Getter
@Setter
public class Error {
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * debugId
     */
    @JsonProperty("debug_id")
    private String debugId;
    /**
     * message
     */
    @JsonProperty("message")
    private String message;
    /**
     * details
     */
    @JsonProperty("details")
    private List<ErrorDetail> details;
}
