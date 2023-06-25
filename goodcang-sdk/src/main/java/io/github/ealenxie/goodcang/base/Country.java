package io.github.ealenxie.goodcang.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/25 11:28
 */
@Getter
@Setter
public class Country {

    /**
     * 国家/地区二字码
     */
    @JsonProperty("country_code")
    private String countryCode;
    /**
     * 国家/地区中文名
     */
    @JsonProperty("country_name")
    private String countryName;
    /**
     * 国家/地区英文名
     */
    @JsonProperty("country_name_en")
    private String countryNameEn;
}
