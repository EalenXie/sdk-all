package io.github.ealenxie.amazon.vo.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BuyerTaxInfo {
    /**
     * 公司名称
     */
    @JsonProperty("CompanyLegalName")
    private String companyLegalName;
    /**
     * 征收税的国家或地区
     */
    @JsonProperty("TaxingRegion")
    private String taxingRegion;
    /**
     * 税务分类清单
     */
    @JsonProperty("TaxClassifications")
    private List<TaxClassification> taxClassifications;
}