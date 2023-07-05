package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/5 11:17
 * @version 1.0
 */
@Getter
@Setter
public class PromotionCampaignResponse {

    /**
     * promotionCampaigns
     */
    @JsonProperty("promotionCampaigns")
    private List<PromotionCampaigns> promotionCampaigns;
    /**
     * totalCount
     */
    @JsonProperty("totalCount")
    private Integer totalCount;
}
