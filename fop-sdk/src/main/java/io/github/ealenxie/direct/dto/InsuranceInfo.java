package io.github.ealenxie.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/21 12:50
 */
@Getter
@Setter
public class InsuranceInfo {
    @JsonProperty("insure_type")
    private String insureType;
    @JsonProperty("insure_value")
    private Integer insureValue;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("insure_person")
    private String insurePerson;
    @JsonProperty("certificate_type")
    private String certificateType;
    @JsonProperty("certificate_no")
    private String certificateNo;
    @JsonProperty("category_code")
    private String categoryCode;
    @JsonProperty("insure_product_name")
    private String insureProductName;
    @JsonProperty("package_qty")
    private String packageQty;
}
