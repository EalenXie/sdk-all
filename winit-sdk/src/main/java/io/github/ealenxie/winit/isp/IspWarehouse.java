package io.github.ealenxie.winit.isp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/14 18:04
 */
@Getter
@Setter
public class IspWarehouse {

    /**
     * warehouseAddress
     */
    @JsonProperty("warehouseAddress")
    private String warehouseAddress;
    /**
     * warehouseID
     */
    @JsonProperty("warehouseID")
    private String warehouseID;
    /**
     * warehouseName
     */
    @JsonProperty("warehouseName")
    private String warehouseName;
    /**
     * warehouseCode
     */
    @JsonProperty("warehouseCode")
    private String warehouseCode;
}
