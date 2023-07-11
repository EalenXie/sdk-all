package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/10 11:08
 */
@Getter
@Setter
public class Error {
    /**
     * code
     */
    @JsonProperty("code")
    private String code;
    /**
     * field
     */
    @JsonProperty("field")
    private String field;
    /**
     * description
     */
    @JsonProperty("description")
    private String description;
    /**
     * severity
     */
    @JsonProperty("severity")
    private String severity;
    /**
     * category
     */
    @JsonProperty("category")
    private String category;
}
