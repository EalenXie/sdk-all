package io.github.ealenxie.wish.productboost;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/13 14:29
 */
@Getter
@Setter
public class KeywordPayload {

    /**
     * hotness
     */
    @JsonProperty("hotness")
    private String hotness;
    /**
     * keyword
     */
    @JsonProperty("keyword")
    private String keyword;
}
