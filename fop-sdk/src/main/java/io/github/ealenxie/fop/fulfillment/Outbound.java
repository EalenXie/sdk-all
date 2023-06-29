package io.github.ealenxie.fop.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/10/8 16:03
 */
@Getter
@Setter
public class Outbound {

    /**
     * 出库委托单号
     */
    @JsonProperty("consignment_no")
    private String consignmentNo;

    /**
     * 客户操作账号
     */
    @JsonProperty("customer_code")
    private String customerCode;

    /**
     * 4PX跟踪号
     */
    @JsonProperty("4px_tracking_no")
    private String trackingNo;

    /**
     * 客户参考号
     */
    @JsonProperty("ref_no")
    private String refNo;

    /**
     * 发货仓库代码
     */
    @JsonProperty("from_warehouse_code")
    private String fromWarehouseCode;

    /**
     * 出库委托状态。可选值：N（草稿）；S（出库中）；P（已下架）；C（已出库）；X（已取消）；D（已删除）；E（异常）
     */
    @JsonProperty("status")
    private String status;

    /**
     * 异常子状态： G（欠费）；B（计费异常）；R（审核失败）；S（缺货）
     */
    @JsonProperty("consignment_type")
    private String consignmentType;

    /**
     * 物流产品代码
     */
    @JsonProperty("logistics_product_code")
    private String logisticsProductCode;

    /**
     * 出库退件标识。如：N（未退件）;R1（服务商退件）;R2（GRS退件）;R9（GRS取消退件）
     */
    @JsonProperty("return_flag")
    private String returnFlag;

    /**
     * 退件服务
     */
    @JsonProperty("return_service")
    private String returnService;

    /**
     * 单独报关。如：N(否);YRR (单独报关且退税); YNR(单独报关不退税)。
     */
    @JsonProperty("customs_service")
    private String customsService;

    /**
     * 签名服务
     */
    @JsonProperty("signature_service")
    private String signatureService;

    /**
     * 物流单号
     */
    @JsonProperty("shipping_no")
    private String shippingNo;

    /**
     * 出库委托单总重量，重量单位为：g(克)
     */
    @JsonProperty("total_weight")
    private String totalWeight;

    /**
     * 出库委托单计费重，重量单位为：g(克)
     */
    @JsonProperty("billing_weight")
    private String billingWeight;

    /**
     * 出库委托单签出重，重量单位为：g(克)
     */
    @JsonProperty("shipping_weight")
    private String shippingWeight;

    /**
     * 出库委托单总体积，重量单位为：cm³(立方厘米)，精确到3位小数
     */
    @JsonProperty("total_volume")
    private String totalVolume;

    /**
     * 出库委托单计费金额，精确到2位小数
     */
    @JsonProperty("billing_amount")
    private Double billingAmount;

    /**
     * 计费币种
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * 是否偏远邮编
     */
    @JsonProperty("is_oda")
    private String isOda;

    /**
     * 销售平台如：AE(速卖通);WS(Wish);EB(eBay);AM(亚马逊);TM(天猫国际);JD(京东)
     */
    @JsonProperty("sales_platform")
    private String salesPlatform;

    /**
     * 卖家ID
     */
    @JsonProperty("seller_id")
    private String sellerId;

    /**
     * 销售/平台交易号
     */
    @JsonProperty("sales_no")
    private String salesNo;

    /**
     * 保险服务如：8Y(平邮保价);5Y(挂号-快递保价);6P(0.6%保险)
     */
    @JsonProperty("insure_services")
    private String insureServices;

    /**
     * 投保金额币种
     */
    @JsonProperty("insure_value")
    private Integer insureValue;

    /**
     * 出库委托单审核人
     */
    @JsonProperty("audit_user")
    private String auditUser;

    /**
     * 出库委托单审核时间
     */
    @JsonProperty("audit_time")
    private Long auditTime;

    /**
     * 出库委托单创建时间
     */
    @JsonProperty("create_time")
    private Long createTime;

    /**
     * 出库委托单创建人
     */
    @JsonProperty("create_user")
    private String createUser;

    /**
     * 出库委托单修改时间
     */
    @JsonProperty("update_time")
    private Long updateTime;

    /**
     * 出库委托单修改人
     */
    @JsonProperty("update_user")
    private String updateUser;

    /**
     * 出库委托单出库时间
     */
    @JsonProperty("complete_time")
    private Long completeTime;

    /**
     * 备注。客户填写的出库委托备注信息
     */
    @JsonProperty("remark")
    private String remark;

    /**
     * 国家编码
     */
    @JsonProperty("country")
    private String country;

    /**
     * 收件人所在州/省
     */
    @JsonProperty("state")
    private String state;

    /**
     * 收件人所在城市
     */
    @JsonProperty("city")
    private String city;

    /**
     * 收件人所在区/县
     */
    @JsonProperty("district")
    private String district;

    /**
     * 收件人的邮编
     */
    @JsonProperty("post_code")
    private String postCode;

    /**
     * 收件人所在街道/详细地址
     */
    @JsonProperty("street")
    private String street;

    /**
     * 收件人的门牌号
     */
    @JsonProperty("house_number")
    private String houseNumber;

    /**
     * 收件人的公司
     */
    @JsonProperty("company")
    private String company;

    /**
     * 收件人姓
     */
    @JsonProperty("last_name")
    private String lastName;

    /**
     * 收件人名
     */
    @JsonProperty("first_name")
    private String firstName;

    /**
     * 收件人的电话号码/手机号
     */
    @JsonProperty("phone")
    private String phone;

    /**
     * 收件人的Email
     */
    @JsonProperty("email")
    private String email;

    /**
     * 收件人证件号
     */
    @JsonProperty("id_card")
    private String idCard;

    /**
     * 出库委托SKU集合
     */
    @JsonProperty("outboundlist_sku")
    private List<OutboundSku> outboundlistSku;

    /**
     * 出库委托SKU序列号（SN码）集合
     */
    @JsonProperty("outboundlist_serial_no")
    private List<?> outboundlistSerialNo;

    /**
     * 委托类型可选值：S(标准出库);D(下架销毁);R(退仓出库);O(其他出库)
     */
    @JsonProperty("sub_status")
    private String subStatus;

    /**
     * 承运人代码
     */
    @JsonProperty("carrier_code")
    private String carrierCode;

    /**
     * 换号异常信息
     */
    @JsonProperty("error_message_origin")
    private String errorMessageOrigin;

    /**
     * 包裹信息
     */
    @JsonProperty("consignment_packages")
    private List<ConsignmentPackage> consignmentPackages;
}
