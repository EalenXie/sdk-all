package io.github.ealenxie.walmart.marketplace.reviews;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 12:45
 */
@NoArgsConstructor
@Data
public class FailureItem {
    /**
     * itemId
     */
    @JsonProperty("itemId")
    private String itemId;
    /**
     * errorCode
     */
    @JsonProperty("errorCode")
    private String errorCode;
    /**
     * errorDescription
     */
    @JsonProperty("errorDescription")
    private String errorDescription;
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
