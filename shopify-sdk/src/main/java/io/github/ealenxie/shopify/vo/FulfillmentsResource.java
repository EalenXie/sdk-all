package io.github.ealenxie.shopify.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/9/26 15:13
 * <a href="https://shopify.dev/api/admin-rest/2022-07/resources/fulfillment#resource-object">FulfillmentsResource</a>
 */
@Getter
@Setter
public class FulfillmentsResource {

    /**
     * 履行
     */
    @JsonProperty("fulfillments")
    private List<Fulfillment> fulfillments;
}
