package io.github.ealenxie.alyunwms.vo.asn;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/2/22 16:13
 * @version 1.0
 */
@Getter
@Setter
public class AsnVO {

    /**
     * 入库单号
     */
    @JsonProperty("receiving_code")
    private String receivingCode;
    /**
     * 客户参考号
     */
    @JsonProperty("reference_no")
    private String referenceNo;
    /**
     * 合同号
     */
    @JsonProperty("contract_no")
    private String contractNo;
    /**
     * 入库单类型，0中转代发，1自发头程
     */
    @JsonProperty("transit_type")
    private Integer transitType;
    /**
     * 交货方式，0自送，1揽收
     */
    @JsonProperty("income_type")
    private Integer incomeType;
    /**
     * 目的仓库
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    /**
     * 交货仓库
     */
    @JsonProperty("transit_warehouse_code")
    private String transitWarehouseCode;
    /**
     * 头程运输方式
     */
    @JsonProperty("sm_code")
    private String smCode;
    /**
     * 运输方式（自送时，需要填写到仓方式）
     */
    @JsonProperty("shipping_method")
    private String shippingMethod;
    /**
     * 跟踪号
     */
    @JsonProperty("tracking_number")
    private String trackingNumber;
    /**
     * 入库单状态 C:新建 W:头程在途 P:头程收货中 T:头程收货完成 Z:转运中 G:目的仓库收货中 F:目的仓收货完成 E:完成上架 X:废弃
     */
    @JsonProperty("receiving_status")
    private String receivingStatus;
    /**
     * 入库单说明
     */
    @JsonProperty("receiving_desc")
    private String receivingDesc;
    /**
     * 预计到达日期
     */
    @JsonProperty("eta_date")
    private String etaDate;
    /**
     * 创建日期
     */
    @JsonProperty("receiving_add_time")
    private String receivingAddTime;
    /**
     * 修改日期
     */
    @JsonProperty("receiving_modify_time")
    private String receivingModifyTime;
    /**
     * 目的仓收货时间
     */
    @JsonProperty("warehouse_receiving_time")
    private String warehouseReceivingTime;
    /**
     * 目的仓收货完成时间
     */
    @JsonProperty("warehouse_receiving_complete_time")
    private String warehouseReceivingCompleteTime;
    /**
     * 目的仓上架时间
     */
    @JsonProperty("warehouse_shelf_time")
    private String warehouseShelfTime;
    /**
     * 揽收支持的省ID
     */
    @JsonProperty("region_id_level0")
    private String regionIdLevelZero;
    /**
     * 揽收支持的市ID
     */
    @JsonProperty("region_id_level1")
    private String regionIdLevelOne;
    /**
     * 揽收支持的区ID
     */
    @JsonProperty("region_id_level2")
    private String regionIdLevelTwo;
    /**
     * 揽收地址
     */
    @JsonProperty("street")
    private String street;
    /**
     * 联系人，交货方式为揽收时，必填
     */
    @JsonProperty("contacter")
    private String contacter;
    /**
     * 联系电话，交货方式为揽收时，必填
     */
    @JsonProperty("contact_phone")
    private String contactPhone;
    /**
     * 总箱数
     */
    @JsonProperty("box_total")
    private String boxTotal;
    /**
     * 产品总数
     */
    @JsonProperty("sku_total")
    private String skuTotal;
    /**
     * SKU种类
     */
    @JsonProperty("sku_species")
    private String skuSpecies;
    /**
     * 计费时间
     */
    @JsonProperty("calculate_fee_time")
    private String calculateFeeTime;
    /**
     * VAT税号
     */
    @JsonProperty("vat_tax_code")
    private String vatTaxCode;
    /**
     * 入库单库存类型：0=以仓库为准,1=标准区,2=暂存区,5=以箱为准(注意前三种库存类型是按单维度，所有箱都是同种库存类型；以箱为准库存类型,是与item.inventory_type参数组合使用)
     */
    @JsonProperty("stock_type")
    private String stockType;
    /**
     * 入库产品详情
     */
    @JsonProperty("items")
    private List<Items> items;
    /**
     * 入库单成本
     */
    @JsonProperty("receiving_cost")
    private List<ReceivingCost> receivingCost;
    @JsonProperty("serial_numbers")
    private List<SerialNumbers> serialNumbers;
    /**
     * 装箱信息
     */
    @JsonProperty("box_info")
    private List<BoxInfo> boxInfo;
    /**
     * 库存批次号信息
     */
    @JsonProperty("batch_info")
    private List<BatchInfo> batchInfo;
}
