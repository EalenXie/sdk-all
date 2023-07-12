package io.github.ealenxie.wish.euproductcompliance;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/12 14:26
 */
@Getter
@Setter
public class ResponsiblePersonQueryParams {
    /**
     * limit
     */
    @JsonProperty("limit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer limit;
    /**
     * sort_by
     */
    @JsonProperty("sort_by")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sortBy;
    @JsonProperty("id_max")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String idMax;
    @JsonProperty("id_min")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String idMin;
}
