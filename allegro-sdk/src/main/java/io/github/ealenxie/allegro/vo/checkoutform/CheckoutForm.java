package io.github.ealenxie.allegro.vo.checkoutform;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.enums.OrderStatus;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/3/24 14:39
 */
@Getter
@Setter
public class CheckoutForm {

    /**
     * 订单id
     */
    @JsonProperty("id")
    private String id;
    /**
     * 留言
     */
    @JsonProperty("messageToSeller")
    private String messageToSeller;
    /**
     * 买家信息
     */
    @JsonProperty("buyer")
    private Buyer buyer;
    /**
     * 支付信息
     */
    @JsonProperty("payment")
    private Payment payment;
    /**
     * 状态
     * <p>BOUGHT 购买时未填写结帐表</p>
     * <p>FILLED_IN 已填写结帐表但付款尚未完成，因此数据仍可能更改</p>
     * <p>READY_FOR_PROCESSING 付款已完成。购买已准备好进行处理</p>
     * <p>CANCELLED 买家取消购买</p>
     * {@link  OrderStatus}
     */
    @JsonProperty("status")
    private String status;
    /**
     * 卖家履行情况
     */
    @JsonProperty("fulfillment")
    private Fulfillment fulfillment;
    /**
     * 物流信息
     */
    @JsonProperty("delivery")
    private Delivery delivery;
    /**
     * 发票信息
     */
    @JsonProperty("invoice")
    private Invoice invoice;
    /**
     * 行信息
     */
    @JsonProperty("lineItems")
    private List<LineItem> lineItems;
    /**
     * 附加费用
     */
    @JsonProperty("surcharges")
    private List<Surcharge> surcharges;
    /**
     * 折扣
     */
    @JsonProperty("discounts")
    private List<Payment> discounts;
    /**
     * 概括信息
     */
    @JsonProperty("summary")
    private Summary summary;
    /**
     * 更新时间
     */
    @JsonProperty("updatedAt")
    private String updatedAt;
    /**
     * 修订
     */
    @JsonProperty("revision")
    private String revision;
}
