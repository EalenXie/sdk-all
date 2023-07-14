package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/14 14:26
 * @version 1.0
 */
@Getter
@Setter
public class InventoryAdjustmentPayload {

    /**
     * turnInCode
     */
    @JsonProperty("turnInCode")
    private String turnInCode;
    /**
     * turnOutCode
     */
    @JsonProperty("turnOutCode")
    private String turnOutCode;
    /**
     * transferInStockType
     */
    @JsonProperty("transferInStockType")
    private String transferInStockType;
    /**
     * transferOutStockType
     */
    @JsonProperty("transferOutStockType")
    private String transferOutStockType;
    /**
     * warehouseCode
     */
    @JsonProperty("warehouseCode")
    private String warehouseCode;
    /**
     * winitProductCode
     */
    @JsonProperty("winitProductCode")
    private String winitProductCode;
    /**
     * merchandiseList
     */
    @JsonProperty("merchandiseList")
    private List<InventoryMerchandise> merchandiseList;
}
