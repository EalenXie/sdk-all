package io.github.ealenxie.wish.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 15:47
 */
@Getter
@Setter
public class CustomerPaidPricesDetail {
    @JsonProperty("total")
    private Amount total;
    @JsonProperty("product_price")
    private Amount productPrice;
    @JsonProperty("product_price_total")
    private Amount productPriceTotal;
    @JsonProperty("shipping_price")
    private Amount shippingPrice;
    @JsonProperty("shipping_price_total")
    private Amount shippingPriceTotal;
}
