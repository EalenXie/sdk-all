package io.github.ealenxie.common.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/2/28 23:15
 */
@Getter
@Setter
public class DeclareCountryVO {
    @JsonProperty("declare_country")
    private String declareCountry;
    @JsonProperty("declare_type")
    private String declareType;
    @JsonProperty("declare_unit_price")
    private String declareUnitPrice;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("declare_country_status")
    private String declareCountryStatus;
    @JsonProperty("hs_code")
    private String hsCode;
    @JsonProperty("qty1")
    private Integer qty1;
    @JsonProperty("qty2")
    private Integer qty2;
    @JsonProperty("unit1")
    private String unit1;
    @JsonProperty("unit2")
    private String unit2;
    @JsonProperty("supplier_code")
    private String supplierCode;
    @JsonProperty("certificate_list")
    private List<Certificate> certificates;
}
