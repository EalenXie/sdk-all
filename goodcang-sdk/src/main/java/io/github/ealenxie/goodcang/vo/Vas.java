package io.github.ealenxie.goodcang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/9/22 13:17
 */
@Getter
@Setter
public class Vas {
    @JsonProperty("logistics_recomendation_option")
    private Integer logisticsRecomendationOption;
    @JsonProperty("logistics_recommendation_option")
    private Integer logisticsRecommendationOption;
    @JsonProperty("label_replacement_option")
    private Integer labelReplacementOption;
    @JsonProperty("is_intransit_priority")
    private Integer isIntransitPriority;

}
