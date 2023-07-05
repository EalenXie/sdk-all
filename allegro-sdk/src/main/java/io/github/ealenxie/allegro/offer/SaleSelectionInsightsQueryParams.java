package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.PageQueryParams;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/5 9:50
 */
@Getter
@Setter
public class SaleSelectionInsightsQueryParams extends PageQueryParams {


    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("availability")
    private List<String> availability;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("category.id")
    private List<String> categoryId;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("phrase")
    private List<String> phrase;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("brand")
    private List<String> brand;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("manufacturerCode")
    private List<String> manufacturerCode;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("hideUnnamed")
    private Boolean hideUnnamed;

}
