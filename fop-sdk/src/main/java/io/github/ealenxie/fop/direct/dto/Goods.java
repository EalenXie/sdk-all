package io.github.ealenxie.fop.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/25 14:51
 */
@Getter
@Setter
public class Goods {
    @JsonProperty("declareProductCode")
    private String declareProductCode;
    @JsonProperty("declareProductNameLocal")
    private String declareProductNameLocal;
    @JsonProperty("declareProductNameEn")
    private String declareProductNameEn;
    @JsonProperty("declareUnitPriceExport")
    private Double declareUnitPriceExport;
    @JsonProperty("declareUnitPriceImport")
    private Double declareUnitPriceImport;
    @JsonProperty("currencyExport")
    private String currencyExport;
    @JsonProperty("currencyImport")
    private String currencyImport;
    @JsonProperty("quantity")
    private Integer quantity;
    @JsonProperty("material")
    private String material;
    @JsonProperty("uses")
    private String uses;
    @JsonProperty("brandExport")
    private String brandExport;
    @JsonProperty("brandImport")
    private String brandImport;
    @JsonProperty("hscodeExport")
    private String hscodeExport;
    @JsonProperty("hscodeImport")
    private String hscodeImport;
}
