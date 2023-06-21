package io.github.ealenxie.shopify.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/9/27 17:05
 */
@Getter
@Setter
public class RequestOption {
    @JsonProperty("shipping_method")
    private String shippingMethod;
    @JsonProperty("note")
    private String note;
    @JsonProperty("date")
    private String date;
}
