package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/14 17:13
 * @version 1.0
 */
@Getter
@Setter
public class WarehouseResponse {

    /**
     * warehouseList
     */
    @JsonProperty("warehouseList")
    private List<Warehouse> warehouseList;
}
