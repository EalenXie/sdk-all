package io.github.ealenxie.eccang.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhs
 * @since 2022年12月26日 0026 11 14
 */
@Getter
@Setter
public class CreateTranferOrderDTO {

    /**
     * 操作类型,新增：ADD 默认ADD
     */
    @JsonProperty("action_type")
    private String actionType;

    /**
     * 调拨仓代码
     */
    @JsonProperty("tranfer_warehouse_code")
    private String tranferWarehouseCode;

    /**
     * 目的仓代码
     */
    @JsonProperty("to_warehouse_code")
    private String toWarehouseCode;

    /**
     * 内调/外调：当数据为中转仓库，调拨到其他仓库，并且配置了TRANSIT_TRANSFER_FOR_IN_AND_OUT后，则内调/外调起效；（1-内调 2-外调）
     */
    @JsonProperty("transitTransferType")
    private String transitTransferType;

    /**
     * 原目的仓库代码
     */
    @JsonProperty("originWarehouse")
    private String originWarehouse;

    /**
     * 运输方式代码
     */
    @JsonProperty("sm_code")
    private String smCode;

    /**
     * 跟踪号（V2.22.9.23）
     */
    @JsonProperty("tracking_number")
    private String trackingNumber;

    /**
     * 参考号
     */
    @JsonProperty("ref_no")
    private String refNo;

    /**
     * 备注
     */
    @JsonProperty("note")
    private String note;

    /**
     * 产品集合
     */
    @JsonProperty("product_data")
    private List<CreateTranferOrderProductDTO> productData;

    /**
     * 调拨单状态，1未确认，2已确认，3已审核，4已出库 默认1
     */
    @JsonProperty("status")
    private Integer status;

}
