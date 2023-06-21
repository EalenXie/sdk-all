package io.github.ealenxie.eccang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Created by EalenXie on 2022/12/12 16:38
 */
@Getter
@Setter
public class ProductCost {

    @JsonProperty("psSku")
    private String psSku;
    @JsonProperty("psCountry")
    private String psCountry;
    @JsonProperty("psDefaultPurchaseCost")
    private BigDecimal psDefaultPurchaseCost;
    @JsonProperty("psDefaultPurchaseFreight")
    private BigDecimal psDefaultPurchaseFreight;
    @JsonProperty("psDefaultFirstJourneyCost")
    private BigDecimal psDefaultFirstJourneyCost;
    @JsonProperty("psDefaultTariffCost")
    private BigDecimal psDefaultTariffCost;
    @JsonProperty("updateTime")
    private String updateTime;

}
