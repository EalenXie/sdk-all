package io.github.ealenxie.edayun.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WarehouseVO {


    @JsonProperty("warehouseId")
    private Integer warehouseId;
    @JsonProperty("warehouseName")
    private String warehouseName;
    @JsonProperty("warehouseCnName")
    private String warehouseCnName;
    @JsonProperty("countryCode")
    private String countryCode;
}
