package io.github.ealenxie.walmart.marketplace.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


/**
 * @author EalenXie
 * @since 2022/08/04 12:45
 */
@Getter
@Setter
public class WalmartOrdersResp {


    @JsonProperty("list")
    private WalmartOrders orders;


}
