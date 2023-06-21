package io.github.ealenxie.shopify.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;


@Getter
@Setter
public class Order {

    /**
     * id
     **/
    @JsonProperty("id")
    private Long id;

    /**
     *
     */
    @JsonProperty("admin_graphql_api_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String adminGraphqlApiId;
    /**
     * 创建订单应用程序的id
     **/
    @JsonProperty("app_id")
    private String appId;
    /**
     * 浏览器IP
     **/
    @JsonProperty("browser_ip")
    private String browserIp;
    /**
     * 客户是否同意从商店接收电子邮件更新
     **/
    @JsonProperty("buyer_accepts_marketing")
    private Boolean buyerAcceptsMarketing;
    /**
     * 取消原因
     **/
    @JsonProperty("cancel_reason")
    private String cancelReason;
    /**
     * 取消订单的日期和时间。 如果订单未被取消，则返回 null。
     **/
    @JsonProperty("cancelled_at")
    private String cancelledAt;
    /**
     * 引用与订单关联的购物车时的token
     **/
    @JsonProperty("cart_token")
    private String cartToken;
    /**
     * 结账时的id
     **/
    @JsonProperty("checkout_id")
    private Long checkoutId;
    /**
     * 结账时的token
     **/
    @JsonProperty("checkout_token")
    private String checkoutToken;
    /**
     * 订单关闭的日期和时间。 如果订单未关闭，则返回 null。
     **/
    @JsonProperty("closed_at")
    private String closedAt;
    /**
     * 是否确认
     **/
    @JsonProperty("confirmed")
    private Boolean confirmed;
    /**
     * 联系邮箱
     **/
    @JsonProperty("contact_email")
    private String contactEmail;
    /**
     * 订单创建的日期和时间。 如果订单未关闭，则返回 null。
     **/
    @JsonProperty("created_at")
    private String createdAt;
    /**
     * 货币
     **/
    @JsonProperty("currency")
    private String currency;
    /**
     * 语言代码
     **/
    @JsonProperty("customer_locale")
    private String customerLocale;
    /**
     *
     **/
    @JsonProperty("device_id")
    private String deviceId;
    /**
     * 订单的折扣列表
     **/
    @JsonProperty("discount_codes")
    private List<DiscountCode> discountCodes;
    /**
     * 邮件地址
     **/
    @JsonProperty("email")
    private String email;
    /**
     * 付款状态
     * pending: 付款待处理
     * authorized: 付款已被授权
     * partially_paid: 订单已部分支付
     * paid: 已付款
     * partially_refunded: 付款已部分退还
     * refunded: 已退还款项
     * voided: 付款已作废
     **/
    @JsonProperty("financial_status")
    private String financialStatus;
    /**
     * 履行状态
     **/
    @JsonProperty("fulfillment_status")
    private String fulfillmentStatus;
    /**
     * 使用的支付网关
     **/
    @JsonProperty("gateway")
    private String gateway;
    /**
     * 登录站点
     **/
    @JsonProperty("landing_site")
    private String landingSite;
    /**
     * 登录站点参考
     **/
    @JsonProperty("landing_site_ref")
    private String landingSiteRef;
    /**
     * 位置id
     **/
    @JsonProperty("location_id")
    private String locationId;
    /**
     * 名称
     **/
    @JsonProperty("name")
    private String name;
    /**
     * 备注
     **/
    @JsonProperty("note")
    private String note;
    /**
     * 备注详情
     **/
    @JsonProperty("note_attributes")
    private List<NoteAttribute> noteAttributes;
    /**
     * 订单在商店订单数中的位置
     **/
    @JsonProperty("number")
    private Integer number;
    /**
     * 订单在商店订单计数中的位置从 1001 开始
     **/
    @JsonProperty("order_number")
    private Long orderNumber;
    /**
     * 订单状态url
     **/
    @JsonProperty("order_status_url")
    private String orderStatusUrl;
    /**
     * 支付网关名称
     **/
    @JsonProperty("payment_gateway_names")
    private List<String> paymentGatewayNames;
    /**
     * 客户电话
     **/
    @JsonProperty("phone")
    private String phone;
    /**
     * 显示的币种
     **/
    @JsonProperty("presentment_currency")
    private String presentmentCurrency;
    /**
     * 处理订单的日期和时间
     **/
    @JsonProperty("processed_at")
    private String processedAt;
    /**
     * 处理订单的方式
     **/
    @JsonProperty("processing_method")
    private String processingMethod;
    /**
     * 参考链接
     **/
    @JsonProperty("reference")
    private String reference;
    /**
     * 商店链接网站
     **/
    @JsonProperty("referring_site")
    private String referringSite;
    /**
     * 来源识别
     **/
    @JsonProperty("source_identifier")
    private String sourceIdentifier;
    /**
     * 来源名称
     **/
    @JsonProperty("source_name")
    private String sourceName;
    /**
     * 来源url
     **/
    @JsonProperty("source_url")
    private String sourceUrl;
    /**
     * 小计价格
     **/
    @JsonProperty("subtotal_price")
    private String subtotalPrice;
    /**
     * 小计价格集
     **/
    @JsonProperty("subtotal_price_set")
    private DataSet subtotalPriceSet;
    /**
     * 标签
     **/
    @JsonProperty("tags")
    private String tags;
    /**
     * 税目
     **/
    @JsonProperty("tax_lines")
    private List<TaxLine> taxLines;
    /**
     * 是否含税
     **/
    @JsonProperty("taxes_included")
    private Boolean taxesIncluded;
    /**
     * 是否是测试订单
     **/
    @JsonProperty("test")
    private Boolean test;
    /**
     * 引用订单sku
     **/
    @JsonProperty("token")
    private String token;
    /**
     * 总折扣
     **/
    @JsonProperty("total_discounts")
    private String totalDiscounts;
    /**
     * 总折扣集
     **/
    @JsonProperty("total_discounts_set")
    private DataSet totalDiscountsSet;
    /**
     * 所有订单项价格的总和
     **/
    @JsonProperty("total_line_items_price")
    private String totalLineItemsPrice;
    /**
     * 总价格集
     **/
    @JsonProperty("total_line_items_price_set")
    private DataSet totalLineItemsPriceSet;
    /**
     * 所有订单项价格、折扣、运费、税金和小费的总和
     **/
    @JsonProperty("total_price")
    private String totalPrice;
    /**
     * 所有订单项价格、折扣、运费、税金和小费的总和 集
     **/
    @JsonProperty("total_price_set")
    private DataSet totalPriceSet;
    /**
     * 总价 美元
     **/
    @JsonProperty("total_price_usd")
    private String totalPriceUsd;
    /**
     * 总运费
     **/
    @JsonProperty("total_shipping_price_set")
    private DataSet totalShippingPriceSet;
    /**
     * 总税金
     **/
    @JsonProperty("total_tax")
    private String totalTax;
    /**
     * 总税金集
     **/
    @JsonProperty("total_tax_set")
    private DataSet totalTaxSet;
    /**
     * 小费总数
     **/
    @JsonProperty("total_tip_received")
    private String totalTipReceived;
    /**
     * 总重量
     **/
    @JsonProperty("total_weight")
    private BigDecimal totalWeight;
    /**
     * 订单修改的日期和时间。 如果订单未关闭，则返回 null。
     **/
    @JsonProperty("updated_at")
    private String updatedAt;
    /**
     * 用户id
     **/
    @JsonProperty("user_id")
    private String userId;
    /**
     * 账单地址
     **/
    @JsonProperty("billing_address")
    private Address billingAddress;
    /**
     * 顾客详情
     **/
    @JsonProperty("customer")
    private Customer customer;
    /**
     * 申请折扣
     **/
    @JsonProperty("discount_applications")
    private List<DiscountApplication> discountApplications;
    /**
     * 履行状态
     **/
    @JsonProperty("fulfillments")
    private List<Fulfillment> fulfillments;
    /**
     * 履行每个项目的历史记录
     **/
    @JsonProperty("line_items")
    private List<LineItem> lineItems;
    /**
     * 付款详情
     **/
    @JsonProperty("payment_details")
    private PaymentDetails paymentDetails;
    /**
     * 退款详情
     **/
    @JsonProperty("refunds")
    private List<Refund> refunds;
    /**
     * 送货地址
     **/
    @JsonProperty("shipping_address")
    private Address shippingAddress;
    /**
     * 送货公司
     **/
    @JsonProperty("shipping_lines")
    private List<ShippingLine> shippingLines;

}
