package io.github.ealenxie.manomano.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie
 * @since 2022/08/16 9:42
 */
@Getter
@Setter
public class Order {

    /**
     * 订单号
     */
    @JsonProperty("order_ref")
    private String orderRef;
    @JsonProperty("technical_source")
    private String technicalSource;
    /**
     * 订单状态
     */
    @JsonProperty("status")
    private String status;
    /**
     * 支付方式
     */
    @JsonProperty("payment_solution")
    private String paymentSolution;
    @JsonProperty("payment_solution_value")
    private String paymentSolutionValue;
    /**
     * 下单时间
     */
    @JsonProperty("order_time")
    private String orderTime;
    /**
     * 更新时间
     */
    @JsonProperty("update_time")
    private String updateTime;
    @JsonProperty("is_mmf")
    private String isMmf;
    /**
     * 货币
     */
    @JsonProperty("currency")
    private String currency;
    /**
     * 总价
     */
    @JsonProperty("total_price")
    private String totalPrice;
    /**
     * 总价不包含增值锐
     */
    @JsonProperty("total_price_vat_excl")
    private String totalPriceVatExcl;
    /**
     * 优惠额度
     */
    @JsonProperty("total_voucher")
    private String totalVoucher;
    @JsonProperty("seller_voucher")
    private String sellerVoucher;
    /**
     * 产品价格
     */
    @JsonProperty("products_price")
    private String productsPrice;
    /**
     * 产品价格不含增值锐
     */
    @JsonProperty("products_price_vat_excl")
    private String productsPriceVatExcl;
    /**
     * 运费(支出) 尾程
     */
    @JsonProperty("shipping_price")
    private String shippingPrice;
    /**
     * 运费不包含增值锐
     */
    @JsonProperty("shipping_price_vat_excl")
    private String shippingPriceVatExcl;
    /**
     * 名
     */
    @JsonProperty("firstname")
    private String firstname;
    /**
     * 姓
     */
    @JsonProperty("lastname")
    private String lastname;
    @JsonProperty("fiscalnb")
    private String fiscalnb;
    /**
     * 税号
     */
    @JsonProperty("vat_number")
    private String vatNumber;
    /**
     * 电话号码
     */
    @JsonProperty("siret_number")
    private String siretNumber;
    @JsonProperty("billing_address")
    private BillingAddress billingAddress;
    @JsonProperty("shipping_address")
    private ShippingAddress shippingAddress;
    private Products products;
}
