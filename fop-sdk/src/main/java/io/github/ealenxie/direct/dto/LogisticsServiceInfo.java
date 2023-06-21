package io.github.ealenxie.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/21 12:50
 */
@Getter
@Setter
public class LogisticsServiceInfo {
    @JsonProperty("logistics_product_code")
    private String logisticsProductCode;
    @JsonProperty("customs_service")
    private String customsService;
    @JsonProperty("signature_service")
    private String signatureService;
    @JsonProperty("value_added_services")
    private String valueAddedServices;
}
