package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/20 16:15
 */
@Getter
@Setter
public class BillingInfo {
    /**
     * name
     */
    @JsonProperty("name")
    private Name name;
    /**
     * address
     */
    @JsonProperty("address")
    private Address address;
    /**
     * emailAddress
     */
    @JsonProperty("email_address")
    private String emailAddress;
    /**
     * phones
     */
    @JsonProperty("phones")
    private List<Phone> phones;
    /**
     * additionalInfoValue
     */
    @JsonProperty("additional_info")
    private String additionalInfo;
}
