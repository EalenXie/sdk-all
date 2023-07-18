package io.github.ealenxie.paypal.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Link;
import io.github.ealenxie.paypal.Money;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/11/28 16:14
 */
@Getter
@Setter
public class PaymentDetails {

    @JsonProperty("id")
    private String id;
    @JsonProperty("status")
    private String status;
    @JsonProperty("status_details")
    private StatusDetails statusDetails;
    @JsonProperty("amount")
    private Money amount;
    @JsonProperty("final_capture")
    private Boolean finalCapture;
    @JsonProperty("expiration_time")
    private String expirationTime;
    @JsonProperty("seller_protection")
    private SellerProtection sellerProtection;
    @JsonProperty("seller_receivable_breakdown")
    private SellerReceivableBreakdown sellerReceivableBreakdown;
    @JsonProperty("invoice_id")
    private String invoiceId;
    @JsonProperty("create_time")
    private String createTime;
    @JsonProperty("update_time")
    private String updateTime;
    @JsonProperty("links")
    private List<Link> links;

}
