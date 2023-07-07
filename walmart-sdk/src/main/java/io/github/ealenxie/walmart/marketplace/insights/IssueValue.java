package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 13:20
 */
@Getter
@Setter
public class IssueValue {
    /**
     * title
     */
    @JsonProperty("title")
    private String title;
    /**
     * value
     */
    @JsonProperty("value")
    private String value;
}
