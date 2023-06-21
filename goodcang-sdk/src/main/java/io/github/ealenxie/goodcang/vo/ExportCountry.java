package io.github.ealenxie.goodcang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/5/23 17:09
 */
@Getter
@Setter
public class ExportCountry {
    /**
     * 国家/地区简称
     */
    @JsonProperty("country_code")
    private String countryCode;
    /**
     * 申报价值
     */
    @JsonProperty("declared_value")
    private Double declaredValue;
}
