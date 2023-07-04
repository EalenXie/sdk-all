package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

/**
 * @author EalenXie created on 2023/7/4 9:51
 */
@Getter
@Setter
public class SaleProductsQueryParams {

    /**
     * The EAN values can include EAN, ISBN, and UPC identifier types. Parameter is depracated and will be removed in the future. Please use combination of phrase and mode (GTIN) parameters instead.
     *
     * @deprecated by allegro
     */
    @Deprecated
    @JsonProperty("ean")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String ean;
    @JsonProperty("phrase")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String phrase;
    @JsonProperty("mode")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String mode;
    @JsonProperty("language")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String language;
    @JsonProperty("categoryId")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String categoryId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Map<String, Object> dynamicFilters;
    @JsonProperty("page.id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String pageId;
    @JsonProperty("searchFeatures")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String searchFeatures;
    @JsonProperty("includeDrafts")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean includeDrafts;


}
