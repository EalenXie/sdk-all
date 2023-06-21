package io.github.ealenxie.wish.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 15:47
 */
@Getter
@Setter
public class GeneralPaymentDetails {
    @JsonProperty("shipping_merchant_payment")
    private Amount shippingMerchantPayment;
    @JsonProperty("payment_total")
    private Amount paymentTotal;
    @JsonProperty("product_price")
    private Amount productPrice;
    @JsonProperty("product_merchant_payment")
    private Amount productMerchantPayment;
    @JsonProperty("product_shipping_price")
    private Amount productShippingPrice;
    @JsonProperty("product_quantity")
    private Integer productQuantity;
    @JsonProperty("customer_paid_prices_detail")
    private CustomerPaidPricesDetail customerPaidPricesDetail;
}
