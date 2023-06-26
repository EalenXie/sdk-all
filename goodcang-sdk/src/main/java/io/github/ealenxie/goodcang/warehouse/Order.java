package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/9/22 13:17
 */
@Getter
@Setter
public class Order {

    /**
     * 订单号
     */
    @JsonProperty("order_code")
    private String orderCode;
    /**
     * 客户参考号
     */
    @JsonProperty("reference_no")
    private String referenceNo;
    /**
     * 平台
     */
    @JsonProperty("platform")
    private String platform;

    /**
     * 订单状态 W:待发货
     */
    @JsonProperty("order_status")
    private String orderStatus;

    /**
     * 异常问题原因
     */
    @JsonProperty("abnormal_problem_reason")
    private String abnormalProblemReason;

    /**
     * 配送方式
     */
    @JsonProperty("shipping_method")
    private String shippingMethod;

    /**
     * 跟踪号
     */
    @JsonProperty("tracking_no")
    private String trackingNo;

    /**
     * 配送仓库代码
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;

    /**
     * 物理仓代码
     */
    @JsonProperty("wp_code")
    private String wpCode;

    /**
     * 订单重量
     */
    @JsonProperty("order_weight")
    private Double orderWeight;

    /**
     * 订单说明
     */
    @JsonProperty("order_desc")
    private String orderDesc;

    /**
     * 创建时间
     */
    @JsonProperty("date_create")
    private String dateCreate;

    /**
     * 付款时间
     */
    @JsonProperty("payment_time")
    private String paymentTime;

    /**
     * 审核时间
     */
    @JsonProperty("date_release")
    private String dateRelease;

    /**
     * 出库时间
     */
    @JsonProperty("date_shipping")
    private String dateShipping;

    /**
     * 修改时间
     */
    @JsonProperty("date_modify")
    private String dateModify;

    /**
     * FBA Shipment ID FBA 类型订单必填
     */
    @JsonProperty("fba_shipment_id")
    private String fbaShipmentId;

    /**
     * FBA Shipment ID创建时间 FBA 类型订单必填
     */
    @JsonProperty("fba_shipment_id_create_time")
    private String fbaShipmentIdCreateTime;

    /**
     * 收件人国家二字码
     */
    @JsonProperty("consignee_country_code")
    private String consigneeCountryCode;

    /**
     * 收件人国家/地区
     */
    @JsonProperty("consignee_country_name")
    private String consigneeCountryName;

    /**
     * 省
     */
    @JsonProperty("consignee_state")
    private String consigneeState;

    /**
     * 城市
     */
    @JsonProperty("consignee_city")
    private String consigneeCity;

    /**
     * 区域
     */
    @JsonProperty("consignee_district")
    private String consigneeDistrict;

    /**
     * 地址1
     */
    @JsonProperty("consignee_address1")
    private String consigneeAddress1;

    /**
     * 地址2
     */
    @JsonProperty("consignee_address2")
    private String consigneeAddress2;

    /**
     * 地址3
     */
    @JsonProperty("consignee_address3")
    private String consigneeAddress3;

    /**
     * 邮编
     */
    @JsonProperty("consignee_zipcode")
    private String consigneeZipcode;

    /**
     * 门牌号
     */
    @JsonProperty("consignee_doorplate")
    private String consigneeDoorplate;

    /**
     * 公司
     */
    @JsonProperty("consignee_company")
    private String consigneeCompany;

    /**
     * 收件人名
     */
    @JsonProperty("consignee_name")
    private String consigneeName;

    /**
     * 收件人姓
     */
    @JsonProperty("consignee_last_name")
    private String consigneeLastName;

    /**
     * 收件人电话
     */
    @JsonProperty("consignee_phone")
    private String consigneePhone;

    /**
     * 收件人邮箱
     */
    @JsonProperty("consignee_email")
    private String consigneeEmail;

    /**
     * 年龄检测服务
     */
    @JsonProperty("age_detection")
    private Integer ageDetection;

    /**
     * 订单明细对象数组，元素结构参数 OrderLineItem。
     */
    @JsonProperty("items")
    private List<OrderItem> items;

    /**
     * 订单费用对象，参见OrderFeeComposite。
     */
    @JsonProperty("fee_details")
    private FeeDetails feeDetails;
    /**
     * 一票多箱装箱明细（适用于一票多箱，或者FBA订单）
     */
    @JsonProperty("orderBoxInfo")
    private List<OrderBoxInfo> orderBoxInfo;

    /**
     * LiftGate服务 0为否 1为是
     */
    @JsonProperty("LiftGate")
    private Integer liftGate;

    /**
     * 预计到货日期
     */
    @JsonProperty("estimated_arrival_date")
    private String estimatedArrivalDate;

    /**
     * 到货时间段
     */
    @JsonProperty("estimated_arrival_time")
    private String estimatedArrivalTime;

    /**
     * 发件人信息，参见SenderInfo。（仓库所在地为日本时适用，否则该参数忽略）
     */
    @JsonProperty("sender_info")
    private SenderInfo senderInfo;

    /**
     * 欧盟税改资料，参见VatChangeInfo。（非标准订单时，该参数将被忽略）
     */
    @JsonProperty("vat_change_info")
    private VatChangeInfo vatChangeInfo;

    /**
     * 增值服务选项，参见对象 ValueAddedService。
     */
    @JsonProperty("vas")
    private Vas vas;

    /**
     * 仓库币种
     */
    @JsonProperty("currency_code")
    private String currencyCode;

    /**
     * 是否仓库装箱商品。1是，0否
     */
    @JsonProperty("is_warehouse_packing")
    private Integer isWarehousePacking;

    /**
     * 卡派渠道物流信息，参见对象 TruckInfo。
     */
    @JsonProperty("truck_info")
    private TruckInfo truckInfo;


    @JsonProperty("charge_size")
    private String chargeSize;
    @JsonProperty("real_weight")
    private Double realWeight;
    @JsonProperty("real_size")
    private String realSize;
    @JsonProperty("consigne_zipcode")
    private String consigneZipcode;

    @JsonProperty("order_type")
    private String orderType;
    @JsonProperty("property_label")
    private String propertyLabel;
    @JsonProperty("customer_package_requirement")
    private String customerPackageRequirement;


}
