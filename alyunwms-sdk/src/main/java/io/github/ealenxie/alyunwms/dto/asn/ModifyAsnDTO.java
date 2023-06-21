package io.github.ealenxie.alyunwms.dto.asn;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


/**
 * @author create by sch  2023/2/23 13:18
 * @version 1.0
 */
@Getter
@Setter
public class ModifyAsnDTO {
    /**
     * 入库单号
     */
    @JsonProperty("receiving_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String receivingCode;
    /**
     * 入库单参考号,
     */
    @JsonProperty("reference_no")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String referenceNo;
    /**
     * 交货方式，0自送，1揽收
     */
    @JsonProperty("income_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer incomeType;
    /**
     * 目的仓
     */
    @JsonProperty("warehouse_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String warehouseCode;
    /**
     * 中转仓库，交货方式为自送时，必填
     */
    @JsonProperty("transit_warehouse_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String transitWarehouseCode;
    /**
     * 到仓方式
     */
    @JsonProperty("shipping_method")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String shippingMethod;
    /**
     * entiry号
     */
    @JsonProperty("entiry_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String entiryCode;
    /**
     * 跟踪号(可传多个以英文逗号隔开，需开启 BATCH_TRACKING_NUMBER 这个配置)
     */
    @JsonProperty("tracking_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String trackingNumber;
    /**
     * 入库单描述
     */
    @JsonProperty("receiving_desc")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String receivingDesc;
    /**
     * 预计到达日期
     */
    @JsonProperty("eta_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String etaDate;
    /**
     * 联系人，交货方式为揽收时，必填
     */
    @JsonProperty("contacter")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String contacter;
    /**
     * 联系电话，交货方式为揽收时，必填
     */
    @JsonProperty("contact_phone")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String contactPhone;
    /**
     * 揽收支持的省ID,交货方式为揽收时，必填
     */
    @JsonProperty("region_id_level0")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer regionIdLevelZero;
    /**
     * 揽收支持的市ID,交货方式为揽收时，必填
     */
    @JsonProperty("region_id_level1")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer regionIdLevelOne;
    /**
     * 揽收支持的区ID,交货方式为揽收时，必填
     */
    @JsonProperty("region_id_level2")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer regionIdLevelTwo;
    /**
     * 揽收地址,交货方式为揽收时，必填
     */
    @JsonProperty("street")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String street;
    /**
     * 关税类型：P：实报实销；默认为空
     */
    @JsonProperty("tax_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String taxType;
    /**
     * 报关类型：Y：单独退税报关；N：无退税报关；;默认为空
     */
    @JsonProperty("customer_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String customerType;
    /**
     * 货柜类型：1:20GP;2:40GP；3:40HQ；4:45GP；5:45HQ；6:53HQ；默认为0
     */
    @JsonProperty("container_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer containerType;
    /**
     * 散货类型（托）：0:否;1:是；默认为0
     */
    @JsonProperty("bulk_cargo_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer bulkCargoType;
    /**
     * 托数量
     */
    @JsonProperty("pallet_cnt")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer palletCnt;
    /**
     * 是否生成批次库存；0否，1是；默认0
     */
    @JsonProperty("is_save_inventory_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer isSaveInventoryCode;
    /**
     * 散货类型（件）：0:否;1:是；默认为0
     */
    @JsonProperty("bulk_cargo_type_piece")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer bulkCargoTypePiece;
    /**
     * VAT税号
     */
    @JsonProperty("vat_tax_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String vatTaxCode;
    /**
     * 是否审核,0新建不审核(草稿状态)，1新建并审核， 默认为0， 审核通过之后，不可编辑
     */
    @JsonProperty("verify")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer verify;
    /**
     * 审核来源（区分系统） 默认为WMS
     */
    @JsonProperty("verify_source")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String verifySource;
    /**
     * 入库单库存类型：默认0=以仓库为准,1=标准区,2=暂存区,5=以箱为准
     * (注意前三种库存类型是按单维度，所有箱都是同种库存类型；以箱为准库存类型,是与item.inventory_type参数组合使用)
     */
    @JsonProperty("stock_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String stockType;
    /**
     * 入库单明细
     */
    @JsonProperty("items")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<ModifyItems> items;

}
