package io.github.ealenxie.goodcang.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2022/12/14 10:34
 */
@Getter
@Setter
public class ExportCountryDTO {
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("declared_value")
    private String declaredValue;
}
