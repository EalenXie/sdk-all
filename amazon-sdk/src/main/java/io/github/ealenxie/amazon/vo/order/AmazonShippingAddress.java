package io.github.ealenxie.amazon.vo.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/2/22 16:42
 */
@Getter
@Setter
public class AmazonShippingAddress {

    /**
     * 亚马逊订单id
     */
    @JsonProperty("AmazonOrderId")
    private String amazonOrderId;
    @JsonProperty("ShippingAddress")
    private ShippingAddress shippingAddress;

}
