package io.github.ealenxie.walmart.marketplace.settings;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/11 14:16
 */
@NoArgsConstructor
@Data
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
