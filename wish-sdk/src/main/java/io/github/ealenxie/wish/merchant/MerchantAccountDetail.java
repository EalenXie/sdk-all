package io.github.ealenxie.wish.merchant;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/13 10:13
 */
@Getter
@Setter
public class MerchantAccountDetail {

    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * revenueType
     */
    @JsonProperty("revenue_type")
    private String revenueType;
    /**
     * displayName
     */
    @JsonProperty("display_name")
    private String displayName;
    /**
     * productBoostStatus
     */
    @JsonProperty("product_boost_status")
    private String productBoostStatus;
}
