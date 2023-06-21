package io.github.ealenxie.wish.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 15:47
 */
@Getter
@Setter
public class VatAmount {
    @JsonProperty("shipping_level_vat")
    private Amount shippingLevelVat;
    @JsonProperty("final_vat")
    private Amount finalVat;
    @JsonProperty("product_level_vat")
    private Amount productLevelVat;
}
