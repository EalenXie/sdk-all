package io.github.ealenxie.wish.products;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/13 16:24
 */
@Getter
@Setter
public class ProductUpdateRequestsQueryParams {
    @JsonProperty("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String id;
    @JsonProperty("max_created_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String maxCreatedAt;
    @JsonProperty("min_created_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String minCreatedAt;
    @JsonProperty("product_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String productId;
    @JsonProperty("sort_by")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sortBy;
    @JsonProperty("statuses")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> statuses;


}
