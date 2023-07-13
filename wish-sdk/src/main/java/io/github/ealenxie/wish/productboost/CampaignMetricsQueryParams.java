package io.github.ealenxie.wish.productboost;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/13 15:28
 */
@Getter
@Setter
public class CampaignMetricsQueryParams {
    @JsonProperty("product_ids")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> productIds;
    @JsonProperty("time_max")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String timeMax;
    @JsonProperty("time_min")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String timeMin;
}
