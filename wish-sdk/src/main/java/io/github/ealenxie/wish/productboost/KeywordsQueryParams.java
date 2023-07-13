package io.github.ealenxie.wish.productboost;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/13 14:28
 */
@Getter
@Setter
public class KeywordsQueryParams {
    @JsonProperty("exclude")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> exclude;
    @JsonProperty("keywords")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> keywords;
    @JsonProperty("query")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String query;
}
