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
public class VatAmount {
    @JsonProperty("shipping_level_vat")
    private Money shippingLevelVat;
    @JsonProperty("final_vat")
    private Money finalVat;
    @JsonProperty("product_level_vat")
    private Money productLevelVat;
}
