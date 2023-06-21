package io.github.ealenxie.fop.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 13:02
 */
@Getter
@Setter
public class GetLogisticsProductList {


    @JsonProperty("transport_mode")
    private String transportMode;


    @JsonProperty("source_country_code")
    private String sourceCountryCode;


    @JsonProperty("source_warehouse_code")
    private String sourceWarehouseCode;


    @JsonProperty("dest_country_code")
    private String destCountryCode;
}
