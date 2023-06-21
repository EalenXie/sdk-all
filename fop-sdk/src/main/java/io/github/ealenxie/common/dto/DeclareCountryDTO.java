package io.github.ealenxie.common.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.common.vo.Certificate;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/2/28 23:07
 */
@Getter
@Setter
public class DeclareCountryDTO {
    @JsonProperty("brand")
    private String brand;
    @JsonProperty("certificate_url")
    private String certificateUrl;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("declare_country")
    private String declareCountry;
    @JsonProperty("declare_type")
    private String declareType;
    @JsonProperty("declare_unit_price")
    private Double declareUnitPrice;
    @JsonProperty("certificate_list")
    private List<Certificate> certificateList;
}
