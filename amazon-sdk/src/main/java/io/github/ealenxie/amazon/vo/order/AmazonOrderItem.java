package io.github.ealenxie.amazon.vo.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/2/22 15:18
 */
@Getter
@Setter
public class AmazonOrderItem {
    /**
     * 商品的亚马逊标准识别号(ASIN)
     */
    @JsonProperty("ASIN")
    private String asin;
    /**
     * 订单项标识符
     */
    @JsonProperty("OrderItemId")
    private String orderItemId;
    /**
     * 订单项目数量
     */
    @JsonProperty("QuantityOrdered")
    private Integer quantityOrdered;
    /**
     * 卖方存货单位(SKU)
     */
    @JsonProperty("SellerSKU")
    private String sellerSKU;
    /**
     * 订单标题
     */
    @JsonProperty("Title")
    private String title;
    /**
     * 装运的物品数量
     */
    @JsonProperty("QuantityShipped")
    private Integer quantityShipped;
    /**
     * 产品信息
     */
    @JsonProperty("ProductInfo")
    private ProductInfo productInfo;
    /**
     * 亚马逊积分:购买商品时获得的亚马逊积分的数量和价值
     */
    @JsonProperty("PointsGranted")
    private PointsGranted pointsGranted;
    /**
     * 订单项的销售价格。请注意，订单项是一个项目和一个数量。这意味着ItemPrice的值等于商品的售价乘以订购的数量。注意ItemPrice不包括ShippingPrice和GiftWrapPrice
     */
    @JsonProperty("ItemPrice")
    private Money itemPrice;
    /**
     * 运输价格
     */
    @JsonProperty("ShippingPrice")
    private Money shippingPrice;
    /**
     * 税收
     */
    @JsonProperty("ItemTax")
    private Money itemTax;
    /**
     * 运费税
     */
    @JsonProperty("ShippingTax")
    private Money shippingTax;
    /**
     * 运费的折扣
     */
    @JsonProperty("ShippingDiscount")
    private Money shippingDiscount;
    /**
     * 运费的折扣税
     */
    @JsonProperty("ShippingDiscountTax")
    private Money shippingDiscountTax;
    /**
     * 优惠中所有促销折扣的总和
     */
    @JsonProperty("PromotionDiscount")
    private Money promotionDiscount;
    /**
     * 优惠中所有促销折扣总额的税收
     */
    @JsonProperty("PromotionDiscountTax")
    private Money promotionDiscountTax;
    /**
     * 卖家在创建促销活动时提供的促销活动标识符列表
     */
    @JsonProperty("PromotionIds")
    private List<String> promotionIds;
    /**
     * 货到付款服务的费用
     */
    @JsonProperty("CODFee")
    private Money cODFee;
    /**
     * 货到付款的折扣
     */
    @JsonProperty("CODFeeDiscount")
    private Money cODFeeDiscount;
    /**
     * 是否赠品
     */
    @JsonProperty("IsGift")
    private Boolean isGift;
    /**
     * 卖方所描述的物品状况
     */
    @JsonProperty("ConditionNote")
    private String conditionNote;
    /**
     * The condition of the item.
     * <p>
     * Possible values: New, Used, Collectible, Refurbished, Preorder, Club.
     */
    @JsonProperty("ConditionId")
    private String conditionId;
    /**
     * The subcondition of the item.
     * <p>
     * Possible values: New, Mint, Very Good, Good, Acceptable, Poor, Club, OEM, Warranty, Refurbished Warranty, Refurbished, Open Box, Any, Other.
     */
    @JsonProperty("ConditionSubtypeId")
    private String conditionSubtypeId;
    /**
     * 预定交付开始日期
     */
    @JsonProperty("ScheduledDeliveryStartDate")
    private String scheduledDeliveryStartDate;
    /**
     * 预定交付结束日期
     */
    @JsonProperty("ScheduledDeliveryEndDate")
    private String scheduledDeliveryEndDate;
    /**
     * 对Amazon Business订单可用的特殊价格
     * Possible values: BusinessPrice - A special price that is available only for Amazon Business orders.
     */
    @JsonProperty("PriceDesignation")
    private String priceDesignation;
    /**
     * 扣缴税款的信息
     */
    @JsonProperty("TaxCollection")
    private TaxCollection taxCollection;
    /**
     * When true, the product type for this item has a serial number.
     * <p>
     * Returned only for Amazon Easy Ship orders.
     */
    @JsonProperty("SerialNumberRequired")
    private Boolean serialNumberRequired;
    /**
     * When true, transparency codes are required
     */
    @JsonProperty("IsTransparency")
    private Boolean isTransparency;
    /**
     * 市场的IOSS数字
     */
    @JsonProperty("IossNumber")
    private String iossNumber;
    /**
     * 商店连锁店标识符
     */
    @JsonProperty("StoreChainStoreId")
    private String storeChainStoreId;
    /**
     * The category of deemed reseller. This applies to selling partners that are not based in the EU and is used to
     * help them meet the VAT Deemed Reseller tax laws in the EU and UK.
     * <p>
     * 枚举：IOSS、UOSS
     */
    @JsonProperty("DeemedResellerCategory")
    private String deemedResellerCategory;
    /**
     * 买家信息
     */
    @JsonProperty("BuyerInfo")
    private OrderItemBuyerInfo buyerInfo;
}