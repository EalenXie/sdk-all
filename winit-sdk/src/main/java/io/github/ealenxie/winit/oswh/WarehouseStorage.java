package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Created by EalenXie on 2023/1/20 12:54
 */
@Setter
@Getter
public class WarehouseStorage {
    /**
     * 商品条码
     */
    @JsonProperty("merchandiseSerno")
    private String merchandiseSerno;
    /**
     * 可用库存数量
     */
    @JsonProperty("qtyAvailable")
    private String qtyAvailable;
    /**
     * 客户代码
     */
    @JsonProperty("customerCode")
    private String customerCode;
    /**
     * 已停用字段：产品长度(cm)
     */
    @JsonProperty("producLenght")
    private BigDecimal producLenght;
    /**
     * 冻结数量
     */
    @JsonProperty("qtyFrozen")
    private Integer qtyFrozen;
    /**
     * 已停用字段：inventory在库总库存（返回数值同inStockQty）
     */
    @JsonProperty("inventory")
    private String inventory;
    /**
     * 是否失效
     */
    @JsonProperty("isActive")
    private String isActive;
    /**
     * 万邑通仓库名称
     */
    @JsonProperty("warehouseName")
    private String warehouseName;
    /**
     * 万邑通仓库Code
     */
    @JsonProperty("warehouseCode")
    private String warehouseCode;
    /**
     * 商品名称
     */
    @JsonProperty("productName")
    private String productName;
    /**
     * 待销毁数量：销毁出库订单对应的商品数量
     */
    @JsonProperty("qtyDestruction")
    private Integer qtyDestruction;
    /**
     * 失效VAT冻结数量
     */
    @JsonProperty("prohibitFrozenQty")
    private String prohibitFrozenQty;
    /**
     * 在途待入库数量
     */
    @JsonProperty("pipelineInventory")
    private String pipelineInventory;
    /**
     * 已停用字段:历史代销量
     */
    @JsonProperty("qtySellHisOut")
    private String qtySellHisOut;
    /**
     * 已停用字段:产品宽度(cm)
     */
    @JsonProperty("productWidth")
    private BigDecimal productWidth;
    /**
     * 已停用字段:存储仓库存
     */
    @JsonProperty("qtySw")
    private String qtySw;
    /**
     * 万邑通仓库ID
     */
    @JsonProperty("warehouseID")
    private Integer warehouseID;
    /**
     * 丢失确认中数量
     */
    @JsonProperty("qtyLostConfirming")
    private Integer qtyLostConfirming;
    @JsonProperty("productLength")
    private BigDecimal productLength;
    /**
     * 待发数量：出库订单对应的商品出库数量（排除销毁出库单数量），以及调拨单或库存调整单商品出库数量
     */
    @JsonProperty("qtyWaitOut")
    private String qtyWaitOut;
    /**
     * 预售待发数量：预售出库单占用库存
     * 需开通相关预售订单权限
     */
    @JsonProperty("preSaleWaitOutQty")
    private Integer preSaleWaitOutQty;
    /**
     * 已停用字段：产品高度(cm)
     */
    @JsonProperty("productHeight")
    private BigDecimal productHeight;
    /**
     * 已停用字段:共享库存
     */
    @JsonProperty("qtyShareStorage")
    private String qtyShareStorage;
    /**
     * 商品规格
     */
    @JsonProperty("specification")
    private String specification;
    /**
     * 已停用字段:产品重量(kg)
     */
    @JsonProperty("productWeight")
    private BigDecimal productWeight;
    /**
     * 在库总库存
     * 在库总库存=可用库存数量+待发数量+丢失确认中数量+冻结数量+待销毁数量+失效VAT冻结数量+禁止出库数
     */
    @JsonProperty("inStockQty")
    private String inStockQty;
    /**
     * 禁止出库数量
     */
    @JsonProperty("prohibitUsableQty")
    private Integer prohibitUsableQty;
    /**
     * 是否退货库存
     */
    @JsonProperty("isReturnInventory")
    private String isReturnInventory;
    /**
     * 商品编码
     */
    @JsonProperty("productCode")
    private String productCode;
    /**
     * 已停用字段
     */
    @JsonProperty("reservedInventory")
    private String reservedInventory;
}
