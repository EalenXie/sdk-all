package io.github.ealenxie.fop.fulfillment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.fop.fulfillment.vo.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

/**
 * fop交运请求实体
 */
@Getter
@Setter
public class OutboundCreate {

    /**
     * 客户操作账号
     */
    @JsonProperty("customer_code")
    private String customerCode;

    /**
     * 客户参考号 必填
     */
    @JsonProperty("ref_no")
    private String refNo;
    /**
     * 出库仓库代码 必填
     */
    @JsonProperty("from_warehouse_code")
    private String fromWarehouseCode;
    /**
     * 委托类型 必填 可选值： S(标准出库); D(下架销毁); R(退仓出库); DS(dropshipping出库); P(FBA Pro); O(其他出库)。 *注：如果选择是标准出库，SKU的库存质量只能选择良好。
     */
    @JsonProperty("consignment_type")
    private String consignmentType = "S";
    /**
     * 物流服务信息  必填
     */
    @JsonProperty("logistics_service_info")
    private LogisticsServiceInfo logisticsServiceInfo;

    /**
     * 物流单号
     */
    @JsonProperty("shipping_no")
    private String shippingNo;
    /**
     * 服务商标签
     */
    @JsonProperty("shippinglabel")
    private String shippingLabel;
    /**
     * 发票标签
     */
    @JsonProperty("invoice")
    private String invoice;
    /**
     * 客户自定义标签
     */
    @JsonProperty("outside_label")
    private String outsideLabel;
    /**
     * MSDS标签
     */
    @JsonProperty("msds")
    private String msds;
    /**
     * ODA委托单走货标识。可选值：Y(只接收非ODA单)；N(默认都接单)；默认为N
     */
    @JsonProperty("oda")
    private String oda;
    /**
     * 销售平台
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
     * 店铺ID
     */
    @JsonProperty("shop_id")
    private String shopId;
    /**
     * 店铺名称
     */
    @JsonProperty("shop_name")
    private String shopName;
    /**
     * 保险服务
     */
    @JsonProperty("insure_services")
    private String insureServices;
    /**
     * 投保金额币别，采用国际ISO标准
     */
    @JsonProperty("currency")
    private String currency;
    /**
     * 投保金额，精确到2位小数
     */
    @JsonProperty("insure_value")
    private Double insureValue;
    /**
     * 备注
     */
    @JsonProperty("remark")
    private String remark;
    /**
     * 用于FBA VC客户自提时间
     */
    @JsonProperty("pick_date")
    private Date pickDate;
    /**
     * VC自提服务商名称
     */
    @JsonProperty("pickup_vendor")
    private String pickupVendor;
    /**
     * VC客户 ASN&ARN label
     */
    @JsonProperty("vcfba_asn_label")
    private String vcFbaAsnLabel;
    /**
     * VC客户箱标 carton label url
     */
    @JsonProperty("vcfba_carton_label")
    private String vcFbaCartonLabel;
    /**
     * VC客户 BOL label
     */
    @JsonProperty("vcfba_bol_label")
    private String vcFbaBolLabel;

    /**
     * 收件人信息  必填
     */
    @JsonProperty("oconsignment_desc")
    private ConsigneeInfo oConsignmentDesc;
    /**
     * 收件人证件信息
     */
    @JsonProperty("identity_info")
    private IdentityInfo identityInfo;
    /**
     * 出库委托SKU集合 必填  注：单次最大支持100种SKU种类创建，如超出请分批创建。
     */
    @JsonProperty("oconsignment_sku")
    private List<OConsignmentSku> oConsignmentSkus;
    /**
     * 进口报关类型; 可选值：D3(客户自有税号清关)； D4(非客户自有税号清关)
     */
    @JsonProperty("icustoms_service")
    private String iCustomsService;

    /**
     * 出口报关类型; 可选值：D1(客户自行出口报关)； D2(一般贸易【出口退税】)； D5(非一般贸易报关【出口不退税】)； D6(特别监管区手册报关)
     */
    @JsonProperty("ocustoms_service")
    private String oCustomsService;

    /**
     * FBA渠道派送ID
     */
    @JsonProperty("fba_shipment_id")
    private String fbaShipmentId;

    /**
     * FBA订单装箱明细集合
     */
    @JsonProperty("oconsignment_fba")
    private List<OConsignmentFba> oConsignmentFba;

    /**
     * 托唛标签，亚马逊PO号
     */
    @JsonProperty("fba_po_no")
    private String fbaPoNo;

    /**
     * FBA箱唛数量
     */
    @JsonProperty("fba_box_code_qty")
    private Integer fbaBoxCodeQty;

    /**
     * 打印托唛标签面数-默认0面，即不打印 0-4面
     */
    @JsonProperty("pallet_label_qty")
    private String palletLabelQty;

    /**
     * 是否打印超重标签，默认传N，但如果实际超了，接口仍会返回超重标签
     */
    @JsonProperty("over_weight_label_sign")
    private String overWeightLabelSign;

    /**
     * FBA超重标签数量
     */
    @JsonProperty("fba_overweight_label_qty")
    private Integer fbaOverweightLabelQty;

    /**
     * 拓展字段
     */
    @JsonProperty("ReferenceNo")
    private String referenceNo;

    /**
     * 拓展字段
     */
    @JsonProperty("extendFields")
    private ExtendFields extendFields;

    /**
     * 时间戳,取时间的毫秒数
     */
    @JsonProperty("delivery_date")
    private Long deliveryDate;

    /**
     * 对应派送指定时间段code
     */
    @JsonProperty("delivery_timeslot")
    private String deliveryTimeslot;

    /**
     * 税号
     */
    @JsonProperty("vat_no")
    private String vatNo;
}
