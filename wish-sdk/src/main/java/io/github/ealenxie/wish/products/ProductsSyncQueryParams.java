package io.github.ealenxie.wish.products;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/13 17:06
 */
@Getter
@Setter
public class ProductsSyncQueryParams {
    @JsonProperty("created_at_max")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String createdAtMax;
    @JsonProperty("created_at_min")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String createdAtMin;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer limit;
    @JsonProperty("parent_sku")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String parentSku;
    @JsonProperty("sort_by")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sortBy;
    @JsonProperty("state")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String state;
    @JsonProperty("statuses")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> statuses;
    @JsonProperty("updated_at_max")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String updatedAtMax;
    @JsonProperty("updated_at_min")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String updatedAtMin;

}
