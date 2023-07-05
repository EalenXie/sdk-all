package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/5 11:21
 * @version 1.0
 */
@Getter
@Setter
public class CampaignQueryParam {
    /**
     * promotionId
     */
    @JsonProperty("promotion.id")
    private String promotionId;
    /**
     * campaignId
     */
    @JsonProperty("campaign.id")
    private String campaignId;
}
