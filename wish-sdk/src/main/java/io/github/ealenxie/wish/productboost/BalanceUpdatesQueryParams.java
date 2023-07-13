package io.github.ealenxie.wish.productboost;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/13 15:32
 */
@Getter
@Setter
public class BalanceUpdatesQueryParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("limit")
    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("type")
    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("created_at_min")
    private String createdAtMin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("created_at_max")
    private String createdAtMax;
}
