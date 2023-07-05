package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/5 11:17
 * @version 1.0
 */
@Getter
@Setter
public class PromotionCampaigns {
    /**
     * campaign
     */
    @JsonProperty("campaign")
    private IdPayload campaign;
    /**
     * promotion
     */
    @JsonProperty("promotion")
    private IdPayload promotion;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
}
