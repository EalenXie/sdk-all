package io.github.ealenxie.wish.productboost;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/13 14:40
 */
@Getter
@Setter
public class CampaignsQueryParams {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("auto_renew")
    private Boolean autoRenew;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("campaign_id_max")
    private String campaignIdMax;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("campaign_id_min")
    private String campaignIdMin;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("campaign_name")
    private String campaignName;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("created_at_max")
    private String createdAtMax;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("created_at_min")
    private String createdAtMin;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("end_at_max")
    private String endAtMax;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("end_at_min")
    private String endAtMin;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("is_automated")
    private Boolean isAutomated;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("product_id")
    private String productId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("limit")
    private Integer limit;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("sort_by")
    private String sortBy;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("start_at_max")
    private String startAtMax;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("start_at_min")
    private String startAtMin;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("states")
    private List<String> states;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("updated_at_max")
    private String updatedAtMax;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("updated_at_min")
    private String updatedAtMin;
}
