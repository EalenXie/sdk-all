package io.github.ealenxie.shopify.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie
 * @since 2022/08/09 13:50
 */
@Getter
@Setter
public class OrdersRiskResource {

    private List<OrderRisk> risks;
}
