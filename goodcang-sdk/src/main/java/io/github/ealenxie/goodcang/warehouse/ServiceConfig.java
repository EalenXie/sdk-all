package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/26 16:48
 */
@Getter
@Setter
public class ServiceConfig {
    /**
     * 仓库代码
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    /**
     * 仓库名称
     */
    @JsonProperty("warehouse_name")
    private String warehouseName;
    /**
     * 服务类型
     */
    @JsonProperty("cass_type")
    private Integer cassType;
    /**
     * 退货服务类型
     */
    @JsonProperty("service_type_list")
    private List<Integer> serviceTypeList;
    /**
     * 是否支持退件转仓
     */
    @JsonProperty("enable_transit")
    private Integer enableTransit;
    /**
     * return_identification
     */
    @JsonProperty("return_identification")
    private Integer returnIdentification;
    /**
     * 集货仓信息
     */
    @JsonProperty("collect_warehouse")
    private List<CollectWarehouse> collectWarehouse;
}
