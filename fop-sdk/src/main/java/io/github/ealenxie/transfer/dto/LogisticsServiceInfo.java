package io.github.ealenxie.transfer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/1 19:47
 */
@Getter
@Setter
public class LogisticsServiceInfo {
    @JsonProperty("customsService")
    private String customsService;
    @JsonProperty("deliveryCompanyBarcode")
    private String deliveryCompanyBarcode;
    @JsonProperty("deliveryCompanyCode")
    private String deliveryCompanyCode;
    @JsonProperty("deliveryLabelUrl")
    private String deliveryLabelUrl;
    @JsonProperty("logisticsProductCode")
    private String logisticsProductCode;
    @JsonProperty("signatureService")
    private String signatureService;
    @JsonProperty("valueAddedServicesList")
    private List<ValueAddedService> valueAddedServiceList;

}
