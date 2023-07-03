package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/3 15:48
 */
@NoArgsConstructor
@Data
public class MatchingCategoriesResponse {


    /**
     * matchingCategories
     */
    @JsonProperty("matchingCategories")
    private List<MatchingCategory> matchingCategories;
}
