package io.github.ealenxie.alyunwms.dto.asn;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/2/22 16:23
 * @version 1.0
 */
@Getter
@Setter
public class ModifyItems {
    /**
     * SKU
     */
    @JsonProperty("product_sku")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String productSku;
    /**
     * 数量
     */
    @JsonProperty("quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer quantity;
    /**
     * 箱号
     */
    @JsonProperty("box_no")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer boxNo;
    /**
     * 关联条码
     */
    @JsonProperty("associated_barcode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String associatedBarcode;
    /**
     * 箱维度库存类型：0 = 按仓库确认，1 = 标准，2 = 暂存
     * (传值stock_type=5时，注意相同箱号必须保持库存类型一致，箱维度未传默认=仓库确认；stock_type其他值时，箱维度保持stock_type值一致)@JsonInclude(JsonInclude.Include.NON_NULL)
     */
    @JsonProperty("inventory_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String inventoryType;
}
