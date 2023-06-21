package io.github.ealenxie.amazon.vo.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/2/22 12:32
 */
@Getter
@Setter
public class AmazonOrder {


    /**
     * 亚马逊定义的订单标识符
     */
    @JsonProperty("AmazonOrderId")
    private String amazonOrderId;

    /**
     * 上次更新订单的日期。
     */
    @JsonProperty("LastUpdateDate")
    private String lastUpdateDate;
    /**
     * 当前订单状态。
     */
    @JsonProperty("OrderStatus")
    private String orderStatus;
    /**
     * 创建订单的日期。
     */
    @JsonProperty("PurchaseDate")
    private String purchaseDate;
    /**
     * 卖家定义的订单标识符。
     */
    @JsonProperty("SellerOrderId")
    private String sellerOrderId;
    /**
     * 订单是由亚马逊 (AFN) 还是由卖家 (MFN) 完成的。
     */
    @JsonProperty("FulfillmentChannel")
    private String fulfillmentChannel;
    /**
     * 订单中第一项的销售渠道。
     */
    @JsonProperty("SalesChannel")
    private String salesChannel;
    /**
     * 订单中第一项的订单渠道。
     */
    @JsonProperty("OrderChannel")
    private String orderChannel;
    /**
     * 订单的发货服务级别。
     */
    @JsonProperty("ShipServiceLevel")
    private String shipServiceLevel;
    /**
     * 此订单的总费用。
     */
    @JsonProperty("OrderTotal")
    private Money orderTotal;
    /**
     * 运送的物品数量。。
     */
    @JsonProperty("NumberOfItemsShipped")
    private Integer numberOfItemsShipped;
    /**
     * 未发货的商品数量。。。
     */
    @JsonProperty("NumberOfItemsUnshipped")
    private Integer numberOfItemsUnshipped;
    /**
     * 可选	有关货到付款 (COD) 订单的子付款方式的信息。
     */
    @JsonProperty("PaymentExecutionDetail")
    private List<PaymentExecutionDetail> paymentExecutionDetail;
    /**
     * 订单的付款方式。此住宿仅限于货到付款 (COD) 和便利店 (CVS) 付款方式。
     */
    @JsonProperty("PaymentMethod")
    private String paymentMethod;
    /**
     * 订单的付款方式列表。
     */
    @JsonProperty("PaymentMethodDetails")
    private List<String> paymentMethodDetails;
    /**
     * 下订单的市场的标识符。
     */
    @JsonProperty("MarketplaceId")
    private String marketplaceId;
    /**
     * 订单的发货服务级别类别。
     * <p>
     * 可能的值：Expedited、FreeEconomy、NextDay、SameDay、SecondDay、Scheduled、Standard。
     */
    @JsonProperty("ShipmentServiceLevelCategory")
    private String shipmentServiceLevelCategory;
    /**
     * 亚马逊 Easy Ship 订单的状态。此属性仅适用于 Amazon Easy Ship 订单。
     * <p>
     * 可能的值：PendingPickUp、LabelCanceled、PickedUp、OutForDelivery、Damaged、Delivered、RejectedByBuyer、Undeliverable、ReturnedToSeller、ReturningToSeller
     */
    @JsonProperty("EasyShipShipmentStatus")
    private String easyShipShipmentStatus;
    /**
     * 亚马逊结账 (CBA) 的自定义发货标签。
     */
    @JsonProperty("CbaDisplayableShippingLabel")
    private String cbaDisplayableShippingLabel;
    /**
     * 订单的类型。
     */
    @JsonProperty("OrderType")
    private String orderType;
    /**
     * 最早发货日期
     */
    @JsonProperty("EarliestShipDate")
    private String earliestShipDate;
    /**
     * 最新发货日期
     */
    @JsonProperty("LatestShipDate")
    private String latestShipDate;
    /**
     * 最早交货日期
     */
    @JsonProperty("EarliestDeliveryDate")
    private String earliestDeliveryDate;
    /**
     * 最新交货日期
     */
    @JsonProperty("LatestDeliveryDate")
    private String latestDeliveryDate;
    /**
     * 如果为 true，则该订单是 Amazon Business 订单。亚马逊商业订单是买家是经过验证的商业买家的订单。
     */
    @JsonProperty("IsBusinessOrder")
    private Boolean isBusinessOrder;
    /**
     * 如果为真，则该订单是卖家自配送的 Amazon Prime 订单。
     */
    @JsonProperty("IsPrime")
    private Boolean isPrime;
    /**
     * 如果为真，则订单具有优先配送服务水平协议。有关优先配送订单的更多信息，请参阅适用于您的商城的卖家平台帮助中的“优先配送选项”。
     */
    @JsonProperty("IsPremiumOrder")
    private Boolean isPremiumOrder;
    /**
     * 如果为真，则订单为 GlobalExpress 订单。
     */
    @JsonProperty("IsGlobalExpressEnabled")
    private Boolean isGlobalExpressEnabled;
    /**
     * 正在被替换的订单的订单 ID 值。仅当 IsReplacementOrder = true 时返回。
     */
    @JsonProperty("ReplacedOrderId")
    private String replacedOrderId;
    /**
     * 如果为真，这是一个替换订单
     */
    @JsonProperty("IsReplacementOrder")
    private Boolean isReplacementOrder;
    /**
     * 表示卖方必须以预计发货日期回复买方的日期。仅针对 Sourcing on Demand 订单退货。
     */
    @JsonProperty("PromiseResponseDueDate")
    private String promiseResponseDueDate;
    /**
     * 如果为真，则为订单设置预计发货日期。仅针对 Sourcing on Demand 订单退货。
     */
    @JsonProperty("IsEstimatedShipDateSet")
    private Boolean isEstimatedShipDateSet;
    /**
     * 如果为真，则此订单中的商品由 Amazon Business EU SARL (ABEU) 购买并转售。通过购买并立即转售您的商品，ABEU 成为记录卖家，将您的库存出售给不会从第三方卖家购买的客户。
     */
    @JsonProperty("IsSoldByAB")
    private Boolean isSoldByAB;
    /**
     * 如果为真，则此订单中的商品由 Amazon Business EU SARL (ABEU) 购买并转售。通过购买并立即转售您的商品，ABEU 成为记录卖家，将您的库存出售给不会从第三方卖家购买的客户。
     */
    @JsonProperty("IsIBA")
    private Boolean isIBA;
    /**
     *
     */
    @JsonProperty("DefaultShipFromLocationAddress")
    private ShippingAddress defaultShipFromLocationAddress;
    @JsonProperty("BuyerInvoicePreference")
    private String buyerInvoicePreference;
    @JsonProperty("BuyerTaxInformation")
    private BuyerTaxInformation buyerTaxInformation;
    @JsonProperty("FulfillmentInstruction")
    private FulfillmentInstruction fulfillmentInstruction;
    @JsonProperty("IsISPU")
    private Boolean isISPU;
    @JsonProperty("MarketplaceTaxInfo")
    private MarketplaceTaxInfo marketplaceTaxInfo;
    @JsonProperty("SellerDisplayName")
    private String sellerDisplayName;
    @JsonProperty("ShippingAddress")
    private ShippingAddress shippingAddress;
    @JsonProperty("BuyerInfo")
    private BuyerInfo buyerInfo;
    @JsonProperty("AutomatedShippingSettings")
    private AutomatedShippingSettings automatedShippingSettings;

}
