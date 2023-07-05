package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/5 12:54
 */
@NoArgsConstructor
@Data
public class SupportedCategoriesResponse {


    /**
     * supportedCategories
     */
    @JsonProperty("supportedCategories")
    private List<SupportedCategory> supportedCategories;
}
