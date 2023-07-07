package io.github.ealenxie.walmart.marketplace.reports;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 10:13
 */
@Getter
@Setter
public class SellerInfo {
    /**
     * storeFrontUrl
     */
    @JsonProperty("storeFrontUrl")
    private String storeFrontUrl;
    /**
     * sellerStatus
     */
    @JsonProperty("sellerStatus")
    private String sellerStatus;
    /**
     * paymentStatus
     */
    @JsonProperty("paymentStatus")
    private String paymentStatus;
    /**
     * tenure
     */
    @JsonProperty("tenure")
    private Integer tenure;
}
