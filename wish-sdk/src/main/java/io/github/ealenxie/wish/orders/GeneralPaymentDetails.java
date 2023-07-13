package io.github.ealenxie.wish.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.wish.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 15:47
 */
@Getter
@Setter
public class GeneralPaymentDetails {
    @JsonProperty("shipping_merchant_payment")
    private Money shippingMerchantPayment;
    @JsonProperty("payment_total")
    private Money paymentTotal;
    @JsonProperty("product_price")
    private Money productPrice;
    @JsonProperty("product_merchant_payment")
    private Money productMerchantPayment;
    @JsonProperty("product_shipping_price")
    private Money productShippingPrice;
    @JsonProperty("product_quantity")
    private Integer productQuantity;
    @JsonProperty("customer_paid_prices_detail")
    private CustomerPaidPricesDetail customerPaidPricesDetail;
}
