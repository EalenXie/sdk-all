package io.github.ealenxie.shopify.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/9/26 15:15
 */

@Getter
@Setter
public class FulfillmentOrderResource {


    @JsonProperty("fulfillment_orders")
    private List<FulfillmentOrder> fulfillmentOrders;
}
