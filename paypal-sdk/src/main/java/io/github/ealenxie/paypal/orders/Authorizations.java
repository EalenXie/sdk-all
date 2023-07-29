package io.github.ealenxie.paypal.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Link;
import io.github.ealenxie.paypal.Money;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/29 10:03
 */
@Getter
@Setter
public class Authorizations {
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
     * expirationTime
     */
    @JsonProperty("expiration_time")
    private String expirationTime;
    /**
     * links
     */
    @JsonProperty("links")
    private List<Link> links;
}
