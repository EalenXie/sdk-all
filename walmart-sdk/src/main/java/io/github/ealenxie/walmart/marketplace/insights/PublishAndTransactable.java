package io.github.ealenxie.walmart.marketplace.insights;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/7 13:20
 */
@NoArgsConstructor
@Data
public class PublishAndTransactable {
    /**
     * score
     */
    @JsonProperty("score")
    private Integer score;
    /**
     * issueTitle
     */
    @JsonProperty("issueTitle")
    private String issueTitle;
    /**
     * maxIssue
     */
    @JsonProperty("maxIssue")
    private Integer maxIssue;
    /**
     * totalIssue
     */
    @JsonProperty("totalIssue")
    private Integer totalIssue;
    /**
     * issues
     */
    @JsonProperty("issues")
    private List<PublisIssues> issues;
}
