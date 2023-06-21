package io.github.ealenxie.shopify.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie
 * @since 2022/05/18 13:30
 */
@Getter
@Setter
public class SellerDetails {
    @JsonProperty("PayPalAccountID")
    private String payPalAccountID;
    @JsonProperty("SecureMerchantAccountID")
    private String secureMerchantAccountID;
}
