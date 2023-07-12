package io.github.ealenxie.wish.euproductcompliance;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/12 14:06
 */
@NoArgsConstructor
@Data
public class ComplianceStatusQueryParams {
    /**
     * complianceStatuses
     */
    @JsonProperty("compliance_statuses")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> complianceStatuses;
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
    @JsonProperty("product_ids")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> productIds;
    @JsonProperty("product_id_max")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String productIdMax;
    @JsonProperty("product_id_min")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String productIdMin;
}
