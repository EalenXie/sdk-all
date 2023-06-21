package io.github.ealenxie.shopify.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.shopify.enums.Recommendation;
import lombok.Getter;
import lombok.Setter;


/**
 * <a href="https://shopify.dev/api/admin-rest/2021-10/resources/order-risk#resource-object">OrderRisk</a>
 */
@Getter
@Setter
public class OrderRisk {

    /**
     * 订单风险id
     */
    private Long id;
    /**
     * 订单id
     */
    @JsonProperty("order_id")
    private Long orderId;
    /**
     * 订单风险所属的签出id
     */
    @JsonProperty("checkout_id")
    private Long checkoutId;
    /**
     * 订单风险来源
     */
    private String source;
    /**
     * 风险评分
     * A number between 0 and 1 that's assigned to the order. The closer the score is to 1, the more likely it is that the order is fraudulent.
     */
    private String score;
    /**
     * 给商家的建议
     */
    private Recommendation recommendation;
    /**
     * 是否显示订单风险
     */
    private Boolean display;
    /**
     * Whether this order risk is severe enough to force the cancellation of the order.
     * If true, then this order risk is included in the Order canceled message that's
     * shown on the details page of the canceled order.Note: Setting this property to
     * true does not cancel the order. Use this property only if your app automatically cancels the
     * order using the Order resource. If your app doesn't automatically cancel orders based on order
     * risks, then leave this property set to false.
     */
    @JsonProperty("cause_cancel")
    private Boolean causeCancel;
    /**
     * 商家留言,display=true才显示
     */
    private String message;
    /**
     * 商家留言,display=true才显示
     */
    @JsonProperty("merchant_message")
    private String merchantMessage;

}

