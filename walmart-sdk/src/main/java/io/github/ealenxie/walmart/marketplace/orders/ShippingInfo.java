package io.github.ealenxie.walmart.marketplace.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/6 10:03
 */
@NoArgsConstructor
@Data
public class ShippingInfo {
    /**
     * phone
     */
    @JsonProperty("phone")
    private String phone;
    /**
     * estimatedDeliveryDate
     */
    @JsonProperty("estimatedDeliveryDate")
    private Long estimatedDeliveryDate;
    /**
     * estimatedShipDate
     */
    @JsonProperty("estimatedShipDate")
    private Long estimatedShipDate;
    /**
     * methodCode
     */
    @JsonProperty("methodCode")
    private String methodCode;
    /**
     * postalAddress
     */
    @JsonProperty("postalAddress")
    private PostalAddress postalAddress;
}
