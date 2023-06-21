package io.github.ealenxie.goodcang.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.goodcang.vo.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CreateOrderDTO {
    /**
     * 订单参考号(建议使用平台单号)
     */
    @JsonProperty("reference_no")
    private String referenceNo;
    /**
     * 平台
     */
    @JsonProperty("platform")
    private String platform;
    /**
     * 配送方式
     */
    @JsonProperty("shipping_method")
    private String shippingMethod;
    /**
     * 配送仓库
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    /**
     * 收件人国家/地区
     */
    @JsonProperty("country_code")
    private String countryCode;
    /**
     * 省
     */
    @JsonProperty("province")
    private String province;
    /**
     * 城市
     */
    @JsonProperty("city")
    private String city;
    /**
     * 公司名称
     */
    @JsonProperty("company")
    private String company;
    /**
     * 地址1
     */
    @JsonProperty("address1")
    private String address1;
    /**
     * 地址2
     */
    @JsonProperty("address2")
    private String address2;

    /**
     * 地址3
     */
    @JsonProperty("address3")
    private String address3;
    /**
     * 邮编
     */
    @JsonProperty("zipcode")
    private String zipcode;
    /**
     * 门牌号
     */
    @JsonProperty("doorplate")
    private String doorplate;
    /**
     * 收件人姓名
     */
    @JsonProperty("name")
    private String name;

    @JsonProperty("last_name")
    private String lastName;
    /**
     * 分机号
     */
    @JsonProperty("cell_phone")
    private String cellPhone;
    /**
     * 收件人联系方式
     */
    @JsonProperty("phone")
    private String phone;
    /**
     * 收件人邮箱
     */
    @JsonProperty("email")
    private String email;
    /**
     * 订单备注
     */
    @JsonProperty("order_desc")
    private String orderDesc;
    /**
     * 订单包装要求，请注意：未开启订单销售包材服务不支持选择
     * 1：纸箱
     * 2：快递袋
     * 3：气泡袋
     * 4：环保袋
     */
    @JsonProperty("customer_package_requirement")
    private Integer customerPackageRequirement;

    /**
     * 是否直接审核，默认为0
     */
    @JsonProperty("verify")
    private Integer verify;
    /**
     * 派送方式是否允许修改
     */
    @JsonProperty("is_shipping_method_not_allow_update")
    private Integer isShippingMethodNotAllowUpdate;

    /**
     * 签名服务
     */
    @JsonProperty("is_signature")
    private Integer isSignature;
    /**
     * 保险服务
     */
    @JsonProperty("is_insurance")
    private Integer isInsurance;
    /**
     * 保额
     */
    @JsonProperty("insurance_value")
    private Float insuranceValue;
    /**
     * FBA Shipment ID
     */
    @JsonProperty("fba_shipment_id")
    private String fbaShipmentId;
    /**
     * FBA Shipment ID创建时间
     */
    @JsonProperty("fba_shipment_id_create_time")
    private String fbaShipmentIdCreateTime;

    /**
     * 平台模式
     */
    @JsonProperty("property_label")
    private String propertyLabel;


    /**
     * FBA换标服务
     * 1：换标
     * 0：不换标
     * (不填，默认为1)
     */
    @JsonProperty("is_change_label")
    private Integer isChangeLabel;
    /**
     * 若选择的物流产品支持年龄检测服务不填则默认16，该服务只可填16或18。其他物流产品默认为0不检测。
     * 特别说明：如果物流产品支持年龄检测服务，该参数只能传16或18，传0或者不传，将强制改为16。
     */
    @JsonProperty("age_detection")
    private Integer ageDetection;
    /**
     * 订单明细
     */
    @JsonProperty("items")
    private List<Item> items;
    /**
     * LiftGate服务
     */
    @JsonProperty("LiftGate")
    private Integer liftGate;
    /**
     * 付款时间 YYYY-MM-DD HH:MM:SS
     */
    @JsonProperty("payment_time")
    private String paymentTime;
    /**
     * 订单附件id， 参考上传附件接口上传附件。
     */
    @JsonProperty("attachment_ids")
    private Integer[] attachmentIds;
    /**
     * 预计到货日期 物流产品支持则填写， 格式例如：2021-03-01
     */
    @JsonProperty("estimated_arrival_date")
    private String estimatedArrivalDate;
    /**
     * 到货时间段
     */
    @JsonProperty("estimated_arrival_time")
    private Integer estimatedArrivalTime;
    /**
     * 发件人信息
     */
    @JsonProperty("sender_info")
    private SenderInfo senderInfo;
    /**
     * 欧盟税改资料
     */
    @JsonProperty("vat_change_info")
    private VatChangeInfo vatChangeInfo;
    /**
     * 是否贴标 1是，0否
     */
    @JsonProperty("is_euro_label")
    private Integer isEuroLabel;
    /**
     * 增值服务选项
     */
    @JsonProperty("vas")
    private Vas vas;
    /**
     * 是否仓配分离
     * 注意: 新接口已无此字段,这里是兼容处理
     */
    @JsonProperty("business_type")
    private Integer businessType = 0;

    /**
     * 是否仓库装箱商品（FBA订单适用）。
     * 1：是
     * 0：否（默认）
     * is_warehouse_packing = 1时，FBA转仓单信息（carton_info）必填。
     */
    @JsonProperty("is_warehouse_packing")
    private Integer isWarehousePacking;

    /**
     * FBA转仓单信息，参见对象 CartonProductItem。
     * 如果是FBA订单，并且选择仓库装箱商品（is_warehouse_packing = 1），必填。
     */
    @JsonProperty("carton_info")
    private CartonProductItem cartonInfo;

    /**
     * 卡派渠道物流信息
     */
    @JsonProperty("truck_info")
    private TruckInfo truckInfo;


}