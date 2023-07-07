package io.github.ealenxie.walmart.marketplace.utilities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 15:20
 */
@Getter
@Setter
public class TaxonomyQueryParams {
    @JsonProperty("feedType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String feedType;
    @JsonProperty("version")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String version;
}
