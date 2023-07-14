package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/14 17:11
 * @version 1.0
 */
@Getter
@Setter
public class WarehouseQueryParams {

    /**
     * winitProductCode
     */
    @JsonProperty("winitProductCode")
    private String winitProductCode;
    /**
     * warehouseType
     */
    @JsonProperty("warehouseType")
    private String warehouseType;
    /**
     * inspectionWarehouseCode
     */
    @JsonProperty("inspectionWarehouseCode")
    private String inspectionWarehouseCode;
    /**
     * orderType
     */
    @JsonProperty("orderType")
    private String orderType;
}
