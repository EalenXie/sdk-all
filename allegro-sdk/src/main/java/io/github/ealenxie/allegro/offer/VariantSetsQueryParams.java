package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.PageQueryParams;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/5 11:02
 */
@Getter
@Setter
public class VariantSetsQueryParams extends PageQueryParams {

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("query")
    private String query;

}
