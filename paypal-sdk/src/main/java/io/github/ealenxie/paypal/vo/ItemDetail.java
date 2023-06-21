package io.github.ealenxie.paypal.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 商品详情
 * <p>
 * By Ashe
 */
@Getter
@Setter
public class ItemDetail {

    /**
     * 商品代码
     */
    @JsonProperty("item_code")
    private String itemCode;

    /**
     * 商品名称
     */
    @JsonProperty("item_name")
    private String itemName;

    /**
     * 商品描述
     */
    @JsonProperty("item_description")
    private String itemDescription;

    /**
     * 详细地描述关于购买物品的选项选择
     */
    @JsonProperty("item_options")
    private String itemOptions;

    /**
     * 商品数量
     */
    @JsonProperty("item_quantity")
    private String itemQuantity;

    /**
     * 商品单价
     */
    @JsonProperty("item_unit_price")
    private Money itemUnitPrice;

    /**
     * 商品金额
     */
    @JsonProperty("item_amount")
    private Money itemAmount;

    /**
     * 折扣金额
     */
    @JsonProperty("discount_amount")
    private Money discountAmount;

    /**
     * 调整金额
     */
    @JsonProperty("adjustment_amount")
    private Money adjustmentAmount;

    /**
     * 礼品包装金额
     */
    @JsonProperty("gift_wrap_amount")
    private Money giftWrapAmount;

    /**
     * 税率
     */
    @JsonProperty("tax_percentage")
    private String taxPercentage;

    /**
     * 商品税额
     */
    @JsonProperty("tax_amounts")
    private List<Money> taxAmounts;

    /**
     * 基本运费
     */
    @JsonProperty("basic_shipping_amount")
    private Money basicShippingAmount;

    /**
     * 额外运费
     */
    @JsonProperty("extra_shipping_amount")
    private Money extraShippingAmount;

    /**
     * 购买商品或服务的费用
     */
    @JsonProperty("handling_amount")
    private Money handlingAmount;

    /**
     * 保险金额
     */
    @JsonProperty("insurance_amount")
    private Money insuranceAmount;

    /**
     * 商品总金额
     */
    @JsonProperty("total_item_amount")
    private Money totalItemAmount;

    /**
     * 发票号码。标识商家帐单的字母数字字符串。
     */
    @JsonProperty("invoice_number")
    private String invoiceNumber;

    /**
     * 结帐操作
     */
    @JsonProperty("checkout_options")
    private List<CheckoutOption> checkoutOptions;


}
