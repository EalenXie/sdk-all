package io.github.ealenxie.amazon.vo.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderItemBuyerInfo {
    /**
     * 定制订单的买家信息
     */
    @JsonProperty("BuyerCustomizedInfo")
    private BuyerCustomizedInfo buyerCustomizedInfo;
    /**
     * 礼物包装的价格
     */
    @JsonProperty("GiftWrapPrice")
    private Money giftWrapPrice;
    /**
     * 礼品包装价格的税
     */
    @JsonProperty("GiftWrapTax")
    private Money giftWrapTax;
    /**
     * 由买家提供的礼物信息
     */
    @JsonProperty("GiftMessageText")
    private String giftMessageText;
    /**
     * 买家指定的礼品包装级别
     */
    @JsonProperty("GiftWrapLevel")
    private String giftWrapLevel;
}