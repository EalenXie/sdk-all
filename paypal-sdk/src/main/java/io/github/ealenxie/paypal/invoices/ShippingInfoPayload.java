package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/20 16:15
 */
@Getter
@Setter
public class ShippingInfoPayload {
    @JsonProperty("business_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String businessName;
    /**
     * name
     */
    @JsonProperty("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Name name;
    /**
     * address
     */
    @JsonProperty("address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Address address;
}
