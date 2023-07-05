package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/5 12:54
 */
@Getter
@Setter
public class SupportedCategoriesResponse {


    /**
     * supportedCategories
     */
    @JsonProperty("supportedCategories")
    private List<SupportedCategory> supportedCategories;
}
