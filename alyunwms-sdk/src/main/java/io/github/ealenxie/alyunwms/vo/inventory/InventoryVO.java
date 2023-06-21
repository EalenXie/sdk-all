package io.github.ealenxie.alyunwms.vo.inventory;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author lanzhi
 * Created on 2023/2/13 14:26
 **/
@Getter
@Setter
public class InventoryVO {
    /**
     * 产品编码
     */
    @JsonProperty("product_barcode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String productBarcode;
    /**
     * SKU
     */
    @JsonProperty("product_sku")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String productSku;
    /**
     * 自定义编码
     */
    @JsonProperty("reference_no")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String referenceNo;
    /**
     * 产品名称
     */
    @JsonProperty("product_title")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String productTitle;
    /**
     * 产品名称(英文)
     */
    @JsonProperty("product_title_en")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String productTitleEn;
    /**
     * 仓库代码
     */
    @JsonProperty("warehouse_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String warehouseCode;
    /**
     * 在途数量
     */
    @JsonProperty("onway")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer onway;
    /**
     * 待上架数量
     */
    @JsonProperty("pending")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer pending;
    /**
     * 可售数量
     */
    @JsonProperty("sellable")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer sellable;
    /**
     * 不合格数量
     */
    @JsonProperty("unsellable")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer unsellable;
    /**
     * 待出库数量
     */
    @JsonProperty("reserved")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer reserved;
    /**
     * 历史出库数量
     */
    @JsonProperty("shipped")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer shipped;
    /**
     * 分享库存出库数量
     */
    @JsonProperty("sold_shared")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer soldShared;
    /**
     * 分享库存数量
     */
    @JsonProperty("shared")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer shared;
    /**
     * 预警库存数量
     */
    @JsonProperty("warning")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer warning;
    /**
     * 库存最新修改时间
     */
    @JsonProperty("pi_update_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date piUpdateTime;
    /**
     * 仓库id
     */
    @JsonProperty("warehouse_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String warehouseId;
    /**
     * 仓库描述
     */
    @JsonProperty("warehouse_desc")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String warehouseDesc;
}

