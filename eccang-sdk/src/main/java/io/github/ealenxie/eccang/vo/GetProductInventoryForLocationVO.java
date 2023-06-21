package io.github.ealenxie.eccang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月23日 0023 14 02
 */
@Getter
@Setter
public class GetProductInventoryForLocationVO {

    /**
     * 库位
     */
    @JsonProperty("lcCode")
    private String lcCode;

    /**
     * 待出库数量
     */
    @JsonProperty("outQuantity")
    private Integer outQuantity;

    /**
     * 可用数量
     */
    @JsonProperty("quantity")
    private Integer quantity;

    /**
     * 产品SKU
     */
    @JsonProperty("productSku")
    private String productSku;

    /**
     * 仓库名称
     */
    @JsonProperty("warehouseName")
    private String warehouseName;

    /**
     * 仓库编码
     */
    @JsonProperty("warehouseCode")
    private String warehouseCode;

    /**
     * SKU中文名称
     */
    @JsonProperty("productSkuTitle")
    private String productSkuTitle;

    /**
     * SKU英文名称
     */
    @JsonProperty("productSkuEnTitle")
    private String productSkuEnTitle;

    /**
     * 分区存储类型
     */
    @JsonProperty("areaType")
    private Integer areaType;

    /**
     * 分区存储类型中文解释
     */
    @JsonProperty("areaTypeCn")
    private String areaTypeCn;

}
