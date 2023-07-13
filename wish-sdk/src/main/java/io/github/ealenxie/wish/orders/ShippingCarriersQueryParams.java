package io.github.ealenxie.wish.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/18 16:37
 */
@Getter
@Setter
public class ShippingCarriersQueryParams {

    @JsonProperty("dest_country_code")
    private String destCountryCode;
    @JsonProperty("order_type")
    private String orderType;

}
