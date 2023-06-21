package io.github.ealenxie.eccang.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhs
 * @since 2022年12月26日 0026 10 57
 */
@Getter
@Setter
public class SaveCeiveDTO {

    /**
     * 操作类型：ADD 新增、EDIT编辑
     */
    @JsonProperty("actionType")
    private String actionType;

    /**
     * 编辑 出库单时必填
     */
    @JsonProperty("ceiveCode")
    private String ceiveCode;

    /**
     * 出库类型：
     * 0借用,
     * 1领用,
     * 2不良品,
     * 3盘亏,
     * 5退货,
     * 6良品换货,
     * 7次品换良品,
     * 8良品转次品,
     * 9其他,
     * 10线下销售,
     * 11组装,
     * 12拆分
     * 15按批次拆分,
     * 13良品还款,
     * 14不良品还款
     */
    @JsonProperty("ceiveType")
    private Integer ceiveType;

    /**
     * 仓库Id （warehouseId 和 warehouseCode 至少有一个有值）
     */
    @JsonProperty("warehouseId")
    private Integer warehouseId;

    /**
     * 仓库代码 (warehouseId和 warehouseCode 至少有一个有值)
     */
    @JsonProperty("warehouseCode")
    private String warehouseCode;

    /**
     * 第三方仓库代码
     */
    @JsonProperty("ExternalWarehouseCode")
    private String externalWarehouseCode;

    /**
     * 第三方单号
     */
    @JsonProperty("ExternalOrder")
    private String externalOrder;

    /**
     * 出库说明
     */
    @JsonProperty("ceiveNote")
    private String ceiveNote;

    /**
     * 运单号
     */
    @JsonProperty("shippingNumber")
    private String shippingNumber;

    /**
     * 操作人ID
     */
    @JsonProperty("ceiveOprater")
    private String ceiveOprater;

    /**
     * 出库产品代码，具体见下表
     */
    @JsonProperty("cProductList")
    private List<SaveCeiveCProductDTO> cProductList;

    /**
     * 入库产品代码，具体见下表 2,6,7,8,11,12,14必传
     */
    @JsonProperty("rProductList")
    private List<SaveCeiveRProductDTO> rProductList;

    /**
     * 操作 ship出库 confirm确认 verify审核 需按流程来走--创建-确认-审核-出库
     */
    @JsonProperty("operation")
    private String operation;

    /**
     * 审核 Y通过 N不通过 默认Y 编辑时可用
     */
    @JsonProperty("yn")
    private String yn;

    /**
     * 操作备注
     */
    @JsonProperty("op_note")
    private String opNote;


}
