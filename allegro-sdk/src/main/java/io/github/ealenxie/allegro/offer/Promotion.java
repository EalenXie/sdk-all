package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/29 15:51
 */
@Getter
@Setter
public class Promotion {
    /**
     * bold
     */
    @JsonProperty("bold")
    private Boolean bold;
    /**
     * departmentPage
     */
    @JsonProperty("departmentPage")
    private Boolean departmentPage;
    /**
     * emphasized
     */
    @JsonProperty("emphasized")
    private Boolean emphasized;
    /**
     * emphasizedHighlightBoldPackage
     */
    @JsonProperty("emphasizedHighlightBoldPackage")
    private Boolean emphasizedHighlightBoldPackage;
    /**
     * highlight
     */
    @JsonProperty("highlight")
    private Boolean highlight;
}
