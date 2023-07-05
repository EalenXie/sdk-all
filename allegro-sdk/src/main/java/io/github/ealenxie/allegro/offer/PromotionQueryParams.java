package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.PageQueryParams;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/5 13:20
 * @version 1.0
 */
@Getter
@Setter
public class PromotionQueryParams extends PageQueryParams {
    /**
     * offerId
     */
    @JsonProperty("offer.id")
    private String offerId;
    /**
     * promotionType
     */
    @JsonProperty("promotionType")
    private String promotionType;
}
