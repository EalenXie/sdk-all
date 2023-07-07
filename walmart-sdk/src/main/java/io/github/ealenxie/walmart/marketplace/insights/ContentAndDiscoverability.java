package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/7 13:20
 */
@Getter
@Setter
public class ContentAndDiscoverability {
    /**
     * issueCount
     */
    @JsonProperty("issueCount")
    private Integer issueCount;
    /**
     * issues
     */
    @JsonProperty("issues")
    private List<Issue> issues;
}
