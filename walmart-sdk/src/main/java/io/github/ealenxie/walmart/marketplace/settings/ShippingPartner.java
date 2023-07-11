package io.github.ealenxie.walmart.marketplace.settings;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/11 14:16
 */
@Getter
@Setter
public class ShippingPartner {
    /**
     * partnerId
     */
    @JsonProperty("partnerId")
    private String partnerId;
    /**
     * partnerName
     */
    @JsonProperty("partnerName")
    private String partnerName;
    /**
     * partnerDisplayName
     */
    @JsonProperty("partnerDisplayName")
    private String partnerDisplayName;
    /**
     * partnerStoreId
     */
    @JsonProperty("partnerStoreId")
    private String partnerStoreId;
}
