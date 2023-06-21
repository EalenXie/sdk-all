package io.github.ealenxie.paypal.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 拍卖信息
 * <p>
 * By Ashe
 */
@Getter
@Setter
public class AuctionInfo {

    /**
     * 拍卖网站
     */
    @JsonProperty("auction_site")
    private String auctionSite;
    /**
     * 拍卖品网站
     */
    @JsonProperty("auction_item_site")
    private String auctionItemSite;
    /**
     * 拍卖买家编号
     */
    @JsonProperty("auction_buyer_id")
    private String auctionBuyerId;
    /**
     * 拍卖截止日期
     */
    @JsonProperty("auction_closing_date")
    private String auctionClosingDate;

}
