package io.github.ealenxie.goodcang.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author EalenXie created on 2023/6/25 14:01
 */
@Getter
@Setter
public class DeclaredCountry {

    /**
     * 国家/地区简称
     */
    @JsonProperty("country_code")
    private String countryCode;
    /**
     * 申报价值
     * 币种只能为USD，最多保留两位小数
     */
    @JsonProperty("declared_value")
    private BigDecimal declaredValue;
}
