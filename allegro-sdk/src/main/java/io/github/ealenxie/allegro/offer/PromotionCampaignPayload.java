package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/5 11:08
 * @version 1.0
 */
@Getter
@Setter
public class PromotionCampaignPayload {

    /**
     * promotion
     */
    @JsonProperty("promotion")
    private IdPayload promotion;
    /**
     * campaign
     */
    @JsonProperty("campaign")
    private IdPayload campaign;
}
