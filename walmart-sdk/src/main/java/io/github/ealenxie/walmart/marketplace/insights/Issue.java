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
public class Issue {
    /**
     * score
     */
    @JsonProperty("score")
    private Integer score;
    /**
     * isEditable
     */
    @JsonProperty("isEditable")
    private Boolean isEditable;
    /**
     * isSpecAttribute
     */
    @JsonProperty("isSpecAttribute")
    private Boolean isSpecAttribute;
    /**
     * attributeName
     */
    @JsonProperty("attributeName")
    private String attributeName;
    /**
     * issueCount
     */
    @JsonProperty("issueCount")
    private Integer issueCount;
    /**
     * issues
     */
    @JsonProperty("issues")
    private List<IssueValue> issues;
    /**
     * attributeValue
     */
    @JsonProperty("attributeValue")
    private String attributeValue;
}
