package io.github.ealenxie.shopify.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie
 * @since 2022/09/27 14:26
 */
@Getter
@Setter
public class FulfillmentDTO {


    /**
     * 为一个或多个发货订单创建发货 请求参数
     */
    private Fulfillment fulfillment;
}
