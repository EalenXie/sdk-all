package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/5 12:59
 */
@Getter
@Setter
public class CompatibilityListSuggestionResponse {

    /**
     * type
     */
    @JsonProperty("type")
    private String type;
    /**
     * items
     */
    @JsonProperty("items")
    private List<SuggestionItem> items;
}
