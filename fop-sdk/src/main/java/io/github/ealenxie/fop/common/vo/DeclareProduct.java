package io.github.ealenxie.fop.common.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/2/28 23:15
 */
@Getter
@Setter
public class DeclareProduct {
    @JsonProperty("declare_product_code")
    private String declareProductCode;
    @JsonProperty("declare_product_id")
    private String declareProductId;
    @JsonProperty("uses")
    private String uses;
    @JsonProperty("specification")
    private String specification;
    @JsonProperty("model")
    private String model;
    @JsonProperty("material")
    private String material;
    @JsonProperty("declare_product_status")
    private String declareProductStatus;
    @JsonProperty("origin_country")
    private String originCountry;
    @JsonProperty("declare_country_list")
    private List<DeclareCountryPayload> declareCountryList;
    @JsonProperty("declare_sku_list")
    private List<DeclareSku> declareSkuList;
    @JsonProperty("exception_reason")
    private String exceptionReason;
}
