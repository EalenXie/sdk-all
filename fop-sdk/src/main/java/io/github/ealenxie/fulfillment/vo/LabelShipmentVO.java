package io.github.ealenxie.fulfillment.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LabelShipmentVO {

    /**
     * 返回委托单号
     */
    @JsonProperty("consignment_no")
    private String consignmentNo;
    /**
     * 跟踪单号
     */
    @JsonProperty("tracking_no")
    private String trackingNo;
    /**
     * 面单文件
     */
    @JsonProperty("shipping_label")
    private String shippingLabel;
    /**
     * 发货面单格式
     */
    @JsonProperty("shipping_labelformat")
    private String shippingLabelFormat;
    /**
     * 发票标签文件
     */
    @JsonProperty("invoice_label")
    private String invoiceLabel;
    /**
     * 发票标签格式
     */
    @JsonProperty("invoice_labelformat")
    private String invoiceLabelFormat;
}
