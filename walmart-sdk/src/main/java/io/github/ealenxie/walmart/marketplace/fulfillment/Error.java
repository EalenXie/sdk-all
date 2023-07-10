package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/10 11:08
 */
@NoArgsConstructor
@Data
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
