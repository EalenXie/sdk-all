package io.github.ealenxie.eccang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2022/12/26 8:55
 */
@Getter
@Setter
public class GetCountryVO {
    /**
     * 国家ID
     */
    @JsonProperty("country_id")
    private String countryId;
    /**
     * 国家二字码
     */
    @JsonProperty("country_code")
    private String countryCode;
    /**
     * 国家中文名
     */
    @JsonProperty("country_name")
    private String countryName;
    /**
     * 国家英文名
     */
    @JsonProperty("country_name_en")
    private String countryNameEn;

}
