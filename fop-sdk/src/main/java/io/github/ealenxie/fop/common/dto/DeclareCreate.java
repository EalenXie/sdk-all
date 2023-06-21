package io.github.ealenxie.fop.common.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/2/28 23:07
 */
@Getter
@Setter
public class DeclareCreate {

    @JsonProperty("declare_category_id")
    private String declareCategoryId;
    @JsonProperty("declare_country_list")
    private List<DeclareCountryDTO> declareCountryList;
    @JsonProperty("declare_product_code")
    private String declareProductCode;
    @JsonProperty("declare_sku_list")
    private List<DeclareSku> declareSkus;
    @JsonProperty("material")
    private String material;
    @JsonProperty("model")
    private String model;
    @JsonProperty("origin_country")
    private String originCountry;
    @JsonProperty("specification")
    private String specification;
    @JsonProperty("uses")
    private String uses;
}
