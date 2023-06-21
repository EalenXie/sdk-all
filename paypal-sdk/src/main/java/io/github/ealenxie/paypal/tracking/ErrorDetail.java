package io.github.ealenxie.paypal.tracking;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/19 11:26
 */
@Getter
@Setter
public class ErrorDetail {
    /**
     * field
     */
    @JsonProperty("field")
    private String field;
    /**
     * value
     */
    @JsonProperty("value")
    private String value;
    /**
     * location
     */
    @JsonProperty("location")
    private String location;
    /**
     * issue
     */
    @JsonProperty("issue")
    private String issue;
}
