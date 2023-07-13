package io.github.ealenxie.wish.promotionplatform;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/13 16:12
 * @version 1.0
 */
@Getter
@Setter
public class CreatePromotionCampaignPayload {

    /**
     * startAt
     */
    @JsonProperty("start_at")
    private String startAt;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * countries
     */
    @JsonProperty("countries")
    private List<String> countries;
    /**
     * endAt
     */
    @JsonProperty("end_at")
    private String endAt;
    /**
     * variationsDiscountData
     */
    @JsonProperty("variations_discount_data")
    private VariationsDiscountData variationsDiscountData;
    /**
     * promotionType
     */
    @JsonProperty("promotion_type")
    private String promotionType;
}
