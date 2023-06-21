package io.github.ealenxie.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/21 12:50
 */
@Getter
@Setter
public class DeclareProductInfo {
    @JsonProperty("declare_product_code")
    private String declareProductCode;
    @JsonProperty("declare_product_name_cn")
    private String declareProductNameCn;
    @JsonProperty("declare_product_name_en")
    private String declareProductNameEn;
    @JsonProperty("uses")
    private String uses;
    @JsonProperty("specification")
    private String specification;
    @JsonProperty("component")
    private String component;
    @JsonProperty("unit_net_weight")
    private Integer unitNetWeight;
    @JsonProperty("unit_gross_weight")
    private Integer unitGrossWeight;
    @JsonProperty("material")
    private String material;
    @JsonProperty("declare_product_code_qty")
    private Integer declareProductCodeQty;
    @JsonProperty("unit_declare_product")
    private String unitDeclareProduct;
    @JsonProperty("origin_country")
    private String originCountry;
    @JsonProperty("country_export")
    private String countryExport;
    @JsonProperty("country_import")
    private String countryImport;
    @JsonProperty("hscode_export")
    private String hscodeExport;
    @JsonProperty("hscode_import")
    private String hscodeImport;
    @JsonProperty("declare_unit_price_export")
    private Integer declareUnitPriceExport;
    @JsonProperty("currency_export")
    private String currencyExport;
    @JsonProperty("declare_unit_price_import")
    private Double declareUnitPriceImport;
    @JsonProperty("currency_import")
    private String currencyImport;
    @JsonProperty("brand_export")
    private String brandExport;
    @JsonProperty("brand_import")
    private String brandImport;
    @JsonProperty("sales_url")
    private String salesUrl;
    @JsonProperty("package_remarks")
    private String packageRemarks;
}
