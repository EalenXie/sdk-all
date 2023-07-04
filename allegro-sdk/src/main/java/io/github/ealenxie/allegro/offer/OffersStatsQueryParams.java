package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/4 17:09
 * @version 1.0
 */
@Getter
@Setter
public class OffersStatsQueryParams extends DateQueryParams{
    /**
     * offerId
     */
    @JsonProperty("offer.id")
    private String offerId;

}
