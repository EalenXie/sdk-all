package io.github.ealenxie.paypal.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Link;
import io.github.ealenxie.paypal.Money;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/29 10:10
 */
@Getter
@Setter
public class Captures {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * amount
     */
    @JsonProperty("amount")
    private Money amount;
    /**
     * sellerProtection
     */
    @JsonProperty("seller_protection")
    private SellerProtection sellerProtection;
    /**
     * finalCapture
     */
    @JsonProperty("final_capture")
    private Boolean finalCapture;
    /**
     * disbursementMode
     */
    @JsonProperty("disbursement_mode")
    private String disbursementMode;
    /**
     * sellerReceivableBreakdown
     */
    @JsonProperty("seller_receivable_breakdown")
    private SellerReceivableBreakdown sellerReceivableBreakdown;
    /**
     * createTime
     */
    @JsonProperty("create_time")
    private String createTime;
    /**
     * updateTime
     */
    @JsonProperty("update_time")
    private String updateTime;
    /**
     * links
     */
    @JsonProperty("links")
    private List<Link> links;
}
