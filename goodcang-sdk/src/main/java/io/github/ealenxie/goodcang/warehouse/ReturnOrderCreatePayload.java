package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/26 15:03
 */
@Getter
@Setter
public class ReturnOrderCreatePayload {

    /**
     * 订单号
     */
    @JsonProperty("order_code")
    private String orderCode;
    /**
     * 参考号
     */
    @JsonProperty("ref_no")
    private String refNo;
    /**
     * 是否直接审核
     */
    @JsonProperty("is_verify")
    private String isVerify;
    /**
     * 退件收货仓库
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    /**
     * 派送方式
     */
    @JsonProperty("logistics")
    private String logistics;
    /**
     * 物流产品
     */
    @JsonProperty("courier")
    private String courier;
    /**
     * 跟踪号
     */
    @JsonProperty("tracking_no")
    private String trackingNo;
    /**
     * 照片数量
     */
    @JsonProperty("photo_no")
    private Integer photoNo;
    /**
     * 退件原因
     */
    @JsonProperty("ro_desc")
    private String roDesc;
    /**
     * 客服备注
     */
    @JsonProperty("ro_note")
    private String roNote;
    /**
     * 是否退回到集货仓
     */
    @JsonProperty("is_transit")
    private Integer isTransit;
    /**
     * 集货区域仓编码
     */
    @JsonProperty("collect_warehouse_code")
    private String collectWarehouseCode;
    /**
     * 退货服务类型
     */
    @JsonProperty("service_type")
    private Integer serviceType;
    /**
     * 退件标识
     */
    @JsonProperty("return_identification")
    private Integer returnIdentification;
    /**
     * 退件产品明细
     */
    @JsonProperty("product_list")
    private List<ReturnProduct> productList;
    /**
     * 退件发货地址
     */
    @JsonProperty("delivery_address")
    private DeliveryAddress deliveryAddress;
}
