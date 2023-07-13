package io.github.ealenxie.wish.rating;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.wish.PageQueryParams;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/13 15:18
 * @version 1.0
 */
@Getter
@Setter
public class RateQueryParams extends PageQueryParams {
    /**
     * createdAtMax
     */
    @JsonProperty("created_at_max")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String createdAtMax;
    /**
     * createdAtMin
     */
    @JsonProperty("created_at_min")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String createdAtMin;
    /**
     * productId
     */
    @JsonProperty("product_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String productId;
    /**
     * sortBy
     */
    @JsonProperty("ratings")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Integer> ratings;
}
