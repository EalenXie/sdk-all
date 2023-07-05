package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/5 12:46
 */
@Getter
@Setter
public class TaxSettingsQueryParams {
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("category.id")
    private String categoryId;
    @JsonProperty("countryCode")
    private List<String> countryCode;
}
