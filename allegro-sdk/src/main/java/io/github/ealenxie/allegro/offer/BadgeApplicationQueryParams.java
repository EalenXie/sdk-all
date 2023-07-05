package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.PageQueryParams;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/5 10:16
 * @version 1.0
 */
@Getter
@Setter
public class BadgeApplicationQueryParams extends PageQueryParams {
    /**
     * offerId
     */
    @JsonProperty("offer.id")
    private String offerId;
    /**
     * campaignId
     */
    @JsonProperty("campaign.id")
    private String campaignId;

}
