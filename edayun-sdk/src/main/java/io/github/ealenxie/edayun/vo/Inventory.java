package io.github.ealenxie.edayun.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Inventory {
    /**
     * 产品SKU
     */
    @JsonProperty("productSku")
    private String productSku;
    /**
     * 产品名称
     */
    @JsonProperty("productName")
    private String productName;
    /**
     * 仓库名称
     */
    @JsonProperty("warehouseName")
    private String warehouseName;
    /**
     * 实际库存
     */
    @JsonProperty("actualInvQuantity")
    private Integer actualInvQuantity;
    /**
     * 待出库存
     */
    @JsonProperty("invLockQuantity")
    private Integer invLockQuantity;
    /**
     * 可销售库存
     */
    @JsonProperty("salableQuantity")
    private Integer salableQuantity;
    /**
     * 不可售库存
     */
    @JsonProperty("nonSalableQuantity")
    private Integer nonSalableQuantity;
    /**
     * 在途库存
     */
    @JsonProperty("inTransitQuantity")
    private Integer inTransitQuantity;
    /**
     * 产品barCode
     */
    @JsonProperty("barCode")
    private String barCode;
    /**
     * 第一个外部条码
     */
    @JsonProperty("extraBarcode1")
    private String extraBarcode1;
    /**
     * 仓库id
     */
    @JsonProperty("warehouseId")
    private String warehouseId;
}
