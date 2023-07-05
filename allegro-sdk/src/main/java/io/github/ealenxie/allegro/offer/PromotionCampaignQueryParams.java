package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.PageQueryParams;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/5 11:13
 * @version 1.0
 */
@Getter
@Setter
public class PromotionCampaignQueryParams extends PageQueryParams {
    /**
     * promotionId
     */
    @JsonProperty("promotion.id")
    private String promotionId;
}
