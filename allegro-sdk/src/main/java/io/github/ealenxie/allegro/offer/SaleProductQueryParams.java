package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/4 10:44
 */
@Getter
@Setter
public class SaleProductQueryParams {
    @JsonProperty("language")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String language;
    @JsonProperty("categoryId")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String categoryId;
    @JsonProperty("includeDrafts")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean includeDrafts;
}
