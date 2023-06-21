package io.github.ealenxie.armlogi.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/3/28 15:46
 **/
@Getter
@Setter
public class ProductInventory {
    /**
     * 可用数量
     */
    private Integer availableQuantity;
    /**
     * 不良品数量
     */
    private Integer defectiveQuantity;
    /**
     * 缺货
     */
    private Integer notQuantity;
    /**
     * 在途数量
     */
    private Integer onWayQuantity;
    /**
     * 已出库数量
     */
    private Integer outQuantity;
    /**
     * 待上架数量
     */
    private Integer pendingInQuantity;
    /**
     * 待出库数量
     */
    private Integer pendingOutQuantity;
    /**
     * 待出库不良品数量
     */
    private Integer pendingOutRejectsQuantity;
    /**
     * 待出库暂存数量
     */
    private Integer pendingOutTsQuantity;
    /**
     * 产品条码
     */
    private String productBarcode;
    /**
     * 自定义编码
     */
    private String referenceNo;
    /**
     * 暂存数量
     */
    private Integer shortStorageQuantity;
    /**
     * SKU
     */
    private String skuCode;
    /**
     * 库内编码
     */
    private String warehouseBarcode;
    /**
     * 仓库代码
     */
    private String warehouseCode;
}

