package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/9/22 13:17
 */
@Getter
@Setter
public class Vas {

    /**
     * 物流优选时效枚举选项
     */
    @JsonProperty("logistics_recommendation_option")
    private Integer logisticsRecommendationOption;
    /**
     * 换标要求
     */
    @JsonProperty("label_replacement_option")
    private Integer labelReplacementOption;

}
