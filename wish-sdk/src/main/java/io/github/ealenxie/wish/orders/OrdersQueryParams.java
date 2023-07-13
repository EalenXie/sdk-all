package io.github.ealenxie.wish.orders;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/2/23 13:55
 */
@Getter
@Setter
public class OrdersQueryParams {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer limit;
    @JsonProperty("order_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String orderType;
    @JsonProperty("released_at_max")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String releasedAtMax;
    @JsonProperty("released_at_min")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String releasedAtMin;
    @JsonProperty("sort_by")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sortBy;
    @JsonProperty("states")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String states;
    @JsonProperty("updated_at_max")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String updatedAtMax;
    @JsonProperty("updated_at_min")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String updatedAtMin;
}
