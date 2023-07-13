package io.github.ealenxie.wish.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 15:47
 */
@Getter
@Setter
public class WarehouseInformation {
    @JsonProperty("warehouse_type")
    private String warehouseType;
    @JsonProperty("warehouse_name")
    private String warehouseName;
    @JsonProperty("warehouse_id")
    private String warehouseId;
    @JsonProperty("fbw_information")
    private FbwInformation fbwInformation;
}
