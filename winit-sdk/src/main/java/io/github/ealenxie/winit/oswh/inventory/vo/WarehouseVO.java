package io.github.ealenxie.winit.oswh.inventory.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/1/30 10:50
 **/
@Getter
@Setter
public class WarehouseVO {
    /**
     * 海外仓库代码
     */
    @JsonProperty("warehouseCode")
    private String warehouseCode;
    /**
     * 海外仓仓库ID
     */
    @JsonProperty("warehouseID")
    private String warehouseId;
    /**
     * 海外仓仓库名称
     */
    @JsonProperty("warehouseName")
    private String warehouseName;
    /**
     * 海外仓仓库地址
     */
    @JsonProperty("warehouseAddress")
    private String warehouseAddress;
}

