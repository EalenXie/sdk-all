package io.github.ealenxie.winit.oswh.inventory.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/1/20 12:41
 */
@Getter
@Setter
public class QueryWarehouseStorage {

    /**
     * 仓库ID 必传 示例：1000008
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("warehouseID")
    private String warehouseID;
    /**
     * 仓库Code 示例：DE0001
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("warehouseCode")
    private String warehouseCode;
    /**
     * 商品是否有效 示例：Y/N
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("inReturnInventory")
    private String inReturnInventory;
    /**
     * 退货库存 示例：Y/N
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("isActive")
    private String isActive;
    /**
     * 页码
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("pageSize")
    private Integer pageSize;
    /**
     * 每页条数
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("pageNum")
    private Integer pageNum;
}
