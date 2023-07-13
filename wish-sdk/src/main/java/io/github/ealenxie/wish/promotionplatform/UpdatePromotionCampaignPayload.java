package io.github.ealenxie.wish.promotionplatform;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/13 16:29
 * @version 1.0
 */
@Getter
@Setter
public class UpdatePromotionCampaignPayload {

    /**
     * variationsDiscountData
     */
    @JsonProperty("variations_discount_data")
    private VariationsDiscountData variationsDiscountData;
}
