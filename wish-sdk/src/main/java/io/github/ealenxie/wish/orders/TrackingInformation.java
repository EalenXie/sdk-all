package io.github.ealenxie.wish.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/24 15:47
 */
@Getter
@Setter
public class TrackingInformation {
    @JsonProperty("tracking_number")
    private String trackingNumber;
    @JsonProperty("origin_country")
    private String originCountry;
    @JsonProperty("ship_note")
    private String shipNote;
    @JsonProperty("shipping_provider")
    private ProductInformation shippingProvider;
}
