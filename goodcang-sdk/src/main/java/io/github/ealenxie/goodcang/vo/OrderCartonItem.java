package io.github.ealenxie.goodcang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 一票多箱装箱明细
 *
 * @author zhs
 */
@Getter
@Setter
public class OrderCartonItem implements Serializable {
    /**
     * 箱号
     */
    @JsonProperty("box_no")
    private String boxNo;

    /**
     * 箱唛号
     */
    @JsonProperty("box_mark")
    private String boxMark;

    /**
     * FBA箱唛号
     */
    @JsonProperty("fba_box_mark")
    private String fbaBoxMark;

    /**
     * 长，单位CM
     */
    @JsonProperty("ob_length")
    private Double obLength;

    /**
     * 宽，单位CM
     */
    @JsonProperty("ob_width")
    private Double obWidth;

    /**
     * 高，单位CM
     */
    @JsonProperty("ob_height")
    private Double obHeight;

    /**
     * 重量，单位KG
     */
    @JsonProperty("ob_weight")
    private Double obWeight;

    /**
     * 创建时间
     */
    @JsonProperty("ob_add_time")
    private String obAddTime;

    /**
     * 跟踪号
     */
    @JsonProperty("tracking_number")
    private String trackingNumber;

    /**
     * 产品编码
     */
    @JsonProperty("product_barcode")
    private String productBarcode;

    /**
     * 订单号
     */
    @JsonProperty("order_code")
    private String orderCode;

    /**
     * 数量
     */
    @JsonProperty("ob_qty")
    private Integer obQty;

}