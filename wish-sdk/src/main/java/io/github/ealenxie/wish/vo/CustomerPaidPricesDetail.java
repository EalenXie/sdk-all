package io.github.ealenxie.wish.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.wish.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 15:47
 */
@Getter
@Setter
public class CustomerPaidPricesDetail {
    @JsonProperty("total")
    private Money total;
    @JsonProperty("product_price")
    private Money productPrice;
    @JsonProperty("product_price_total")
    private Money productPriceTotal;
    @JsonProperty("shipping_price")
    private Money shippingPrice;
    @JsonProperty("shipping_price_total")
    private Money shippingPriceTotal;
}
