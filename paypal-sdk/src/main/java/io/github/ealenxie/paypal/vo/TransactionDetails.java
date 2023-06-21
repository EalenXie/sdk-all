package io.github.ealenxie.paypal.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionDetails {
    /**
     * 交易信息。
     */
    @JsonProperty("transaction_info")
    private TransactionInfo transactionInfo;

    /**
     * 付款人信息。
     */
    @JsonProperty("payer_info")
    private PayerInfo payerInfo;

    /**
     * 运输信息。
     */
    @JsonProperty("shipping_info")
    private ShippingInfo shippingInfo;

    /**
     * 购物车信息。
     */
    @JsonProperty("cart_info")
    private CartInfo cartInfo;

    /**
     * 店铺信息。
     */
    @JsonProperty("store_info")
    private StoreInfo storeInfo;

    /**
     * 拍卖信息。
     */
    @JsonProperty("auction_info")
    private AuctionInfo auctionInfo;

    /**
     * 激励信息。
     */
    @JsonProperty("incentive_info")
    private IncentiveInfo incentiveInfo;

}
