package io.github.ealenxie.shopify.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/9/27 16:58
 */
@Getter
@Setter
public class DeliveryMethod {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("method_type")
    private String methodType;
    @JsonProperty("min_delivery_date_time")
    private String minDeliveryDateTime;
    @JsonProperty("max_delivery_date_time")
    private String maxDeliveryDateTime;
}
