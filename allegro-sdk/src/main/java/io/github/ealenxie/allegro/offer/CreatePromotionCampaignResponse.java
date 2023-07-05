package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/5 11:10
 * @version 1.0
 */
@Getter
@Setter
public class CreatePromotionCampaignResponse {

    /**
     * campaign
     */
    @JsonProperty("campaign")
    private IdPayload campaign;
    /**
     * link
     */
    @JsonProperty("link")
    private String link;
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
