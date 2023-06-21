package io.github.ealenxie.alyunwms.vo.asn;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.github.ealenxie.alyunwms.deser.AlYunResponseDeserializer;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/2/22 16:56
 * @version 1.0
 */
@Getter
@Setter
public class Items {
    /**
     * SKU
     */
    @JsonProperty("product_sku")
    private String productSku;
    /**
     * 产品编码
     */
    @JsonProperty("product_barcode")
    private String productBarcode;
    /**
     * 数量
     */
    @JsonProperty("quantity")
    private String quantity;
    /**
     * 收货数
     */
    @JsonProperty("received_quantity")
    private String receivedQuantity;
    /**
     * 上架数
     */
    @JsonProperty("putaway_qty")
    private String putawayQty;
    /**
     * 箱号
     */
    @JsonProperty("box_no")
    private String boxNo;
    /**
     * 库位类型统计数量,数组三条数据分表代表良品库位数量，不良品库位数量，暂存库位数量
     */
    @JsonProperty("loCountType")
    private List<String> loCountType;
    /**
     * 上架数量
     */
    @JsonProperty("putaway_quantity")
    private Integer putawayQuantity;
    /**
     * 产品单价
     */
    @JsonProperty("product_price")
    private String productPrice;
    /**
     * 更新时间
     */
    @JsonProperty("rd_update_time")
    private String rdUpdateTime;
    /**
     * 箱维度库存类型：0 = 按仓库确认（默认），1 = 标准，2 = 暂存
     */
    @JsonProperty("inventory_type")
    private String inventoryType;
    /**
     * 入库单产品每一种库位类型的数量
     */
    @JsonProperty("loTypeCount")
    private List<String> loTypeCount;
    /**
     * 产品仓库属性
     */
    @JsonProperty("warehouse_attr")
    @JsonDeserialize(using = AlYunResponseDeserializer.class)
    private List<WarehouseAttr> warehouseAttr;
    /**
     * 产品成本
     */
    @JsonProperty("product_cost")
    private List<ProductCost> productCost;
    /**
     * 产品成本
     */
    @JsonProperty("package_type")
    private String packageType;
}
