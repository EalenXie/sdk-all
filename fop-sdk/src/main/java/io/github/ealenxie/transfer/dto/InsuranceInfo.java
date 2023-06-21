package io.github.ealenxie.transfer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 20:18
 */
@Getter
@Setter
public class InsuranceInfo {
    @JsonProperty("insureType")
    private String insureType;
    @JsonProperty("insureValue")
    private Integer insureValue;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("insurePerson")
    private String insurePerson;
    @JsonProperty("certificateType")
    private String certificateType;
    @JsonProperty("certificateNo")
    private String certificateNo;
    @JsonProperty("categoryCode")
    private String categoryCode;
    @JsonProperty("insureProductName")
    private String insureProductName;
    @JsonProperty("packageQty")
    private String packageQty;
}
