package io.github.ealenxie.fulfillment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月28日 0028 13 54
 */
@Getter
@Setter
public class IConsignmentSku {
    /**
     * 箱序号；客户定义的箱序号，同一箱可存放多种SKU和多个SKU数量。如：1001 *注:如果客户选择贴4px箱唛,则客户必须传箱序号。
     */
    @JsonProperty("box_no")
    private String boxNo;

    /**
     * 客户自定义箱条码。 *注:如果客户选择贴自定义箱唛,则客户必须传自定义的箱条码;
     */
    @JsonProperty("box_barcode")
    private String boxBarcode;

    /**
     * SKU编码；当前箱对应的SKU信息。如：TEST001
     */
    @JsonProperty("sku_code")
    private String skuCode;

    /**
     * SKU预报数量，当前箱内SKU的预报数量。
     */
    @JsonProperty("plan_qty")
    private Integer planQty;

    /**
     * 批次号;根据SKU是否设置批次号。如果在创建SKU的时候设置了批次管理，则客户必须填写SKU批次号。
     */
    @JsonProperty("batch_no")
    private String batchNo;

    /**
     * 失效日期
     */
    @JsonProperty("expired_date")
    private Long expiredDate;

    /**
     * 生产日期
     */
    @JsonProperty("manufacture_date")
    private Long manufactureDate;
}
