package io.github.ealenxie.fulfillment.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月27日 0027 13 24
 */
@Getter
@Setter
public class InboundConsignmentSku {
    /**
     * 箱序号。如：1001
     */
    @JsonProperty("box_no")
    private String boxNo;

    /**
     * 箱条码号。4PX系统生成唯一条码。对应箱条码需要打印在箱上。
     */
    @JsonProperty("box_barcode")
    private String boxBarcode;

    /**
     * SKU数字条码。4PX系统针对SKU生成的唯一条码。
     */
    @JsonProperty("sku_id")
    private String skuId;

    /**
     * SKU编码。当前箱对应的SKU信息。如：TEST001
     */
    @JsonProperty("sku_code")
    private String skuCode;

    /**
     * SKU预报数量，当前箱内SKU的预报数量。
     */
    @JsonProperty("plan_qty")
    private String planQty;

    /**
     * 实际收货数量，当前箱内SKU的实际收货数量。
     */
    @JsonProperty("received_qty")
    private String receivedQty;

    /**
     * 实际上架数量，当前箱内SKU的实际上架数量。
     */
    @JsonProperty("putaway_qty")
    private String putAwayQty;

    /**
     * 异常收货数量，当前箱内SKU的异常收货数量。
     */
    @JsonProperty("exception_qty")
    private String exceptionQty;

    /**
     * SKU失效日期;当前入库委托SKU的有效期。*注：返回时间值格式为long类型，接收到值后需要对long类型值进行转换。
     */
    @JsonProperty("expired_date")
    private Long expiredDate;

    /**
     * SKU批次号。当前入库委托SKU的批次号。
     */
    @JsonProperty("batch_no")
    private String batchNo;

    /**
     * 收货SKU重量（单位：g）。单个SKU重量；如：1234
     */
    @JsonProperty("weight")
    private String weight;

    /**
     * 收货体积(单位：cm³)。单个SKU体积，精确到3位小数；如：124.45
     */
    @JsonProperty("volume")
    private String volume;

    /**
     * 收货长（单位：cm）。单个SKU长，精确到3位小数；如：1234.45
     */
    @JsonProperty("length")
    private String length;

    /**
     * 收货宽（单位：cm）。单个SKU宽，精确到3位小数；如：1234.45
     */
    @JsonProperty("width")
    private String width;

    /**
     * 收货高（单位：cm）。单个SKU高，精确到3位小数；如：1234.45
     */
    @JsonProperty("height")
    private String height;

    /**
     * 商品条码（UPC、EAN、JAN…）
     */
    @JsonProperty("product_code")
    private String productCode;

    /**
     * 是否自带物流包装
     */
    @JsonProperty("logistics_package")
    private String logisticsPackage;
}
