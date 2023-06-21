package io.github.ealenxie.shopify.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


/**
 * Created by EalenXie on 2022/9/26 15:13
 * <a href="https://shopify.dev/api/admin-rest/2022-07/resources/fulfillment#resource-object">FulfillmentResource</a>
 */
@Getter
@Setter
public class FulfillmentResource {

    /**
     * 履行
     **/
    @JsonProperty("fulfillment")
    private Fulfillment fulfillment;
}
