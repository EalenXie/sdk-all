package io.github.ealenxie.winit.oswh.inventory.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/1/28 13:44
 * @version 1.0
 */
@Getter
@Setter
public class ProductInventory {
    /**
     * 可用库存
     */
    @JsonProperty("qtyAvailable")
    private String qtyAvailable;
    /**
     * 商品描述
     */
    @JsonProperty("description")
    private String description;
    /**
     * 冻结库存数
     */
    @JsonProperty("qtyFrozen")
    private Integer qtyFrozen;
    /**
     * 仓库名称
     */
    @JsonProperty("warehouseName")
    private String warehouseName;
    /**
     * 仓库code
     */
    @JsonProperty("warehouseCode")
    private String warehouseCode;
    /**
     * 待销毁数量
     */
    @JsonProperty("qtyDestruction")
    private Integer qtyDestruction;
    /**
     * 近7天平均库存
     */
    @JsonProperty("averageStockQty7")
    private String averageStockQty7;
    /**
     * VAT冻结数量
     */
    @JsonProperty("prohibitFrozenQty")
    private String prohibitFrozenQty;
    @JsonProperty("qtySellHisOut")
    private Integer qtySellHisOut;
    @JsonProperty("qtySw")
    private String qtySw;
    /**
     * 近7天平均销量
     */
    @JsonProperty("averageSalesQty7")
    private String averageSalesQty7;
    /**
     * 丢失确认中数量
     */
    @JsonProperty("qtyLostConfirming")
    private Integer qtyLostConfirming;
    /**
     * 历史入库
     */
    @JsonProperty("qtyHisIn")
    private String qtyHisIn;
    /**
     * 历史出库
     */
    @JsonProperty("qtyHisOut")
    private String qtyHisOut;
    /**
     * 待出库数量
     */
    @JsonProperty("qtyWaitOut")
    private String qtyWaitOut;
    /**
     * 预售待出库数量
     */
    @JsonProperty("preSaleWaitOutQty")
    private String preSaleWaitOutQty;
    @JsonProperty("DOI")
    private String doi;
    @JsonProperty("productId")
    private String productId;
    /**
     * 商品英文名字
     */
    @JsonProperty("eName")
    private String eName;
    /**
     * 近15天平均库存
     */
    @JsonProperty("averageStockQty15")
    private String averageStockQty15;
    @JsonProperty("qtyShareStorage")
    private Integer qtyShareStorage;
    @JsonProperty("DOIAll")
    private String doiAll;
    /**
     * 商品规格
     */
    @JsonProperty("specification")
    private String specification;
    /**
     * 近15天平均销量
     */
    @JsonProperty("averageSalesQty15")
    private String averageSalesQty15;
    /**
     * 平均销量
     */
    @JsonProperty("avgSales")
    private Integer avgSales;
    /**
     * 近30天平均销量
     */
    @JsonProperty("averageSalesQty")
    private String averageSalesQty;
    @JsonProperty("version")
    private String version;
    /**
     * 在库库存数量
     */
    @JsonProperty("inStockQty")
    private String inStockQty;
    /**
     * 是否禁止出库
     */
    @JsonProperty("isprohibitoutbound")
    private String isprohibitoutbound;
    /**
     * 禁止库存数量
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
     * 待出库
     * 待出库=出库订单占用+冻结库存+丢失确认中
     */
    @JsonProperty("qtyReserved")
    private String qtyReserved;
    @JsonProperty("warehouseId")
    private String warehouseId;
    /**
     * 在途库存
     */
    @JsonProperty("qtyOrdered")
    private String qtyOrdered;
    /**
     * 商品中文名字
     */
    @JsonProperty("name")
    private String name;
    /**
     * 近30天平均库存
     */
    @JsonProperty("averageStockQty")
    private String averageStockQty;
}
