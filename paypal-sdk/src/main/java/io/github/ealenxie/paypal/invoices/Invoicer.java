package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/20 16:15
 */
@NoArgsConstructor
@Data
public class Invoicer {
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
     * website
     */
    @JsonProperty("website")
    private String website;
    /**
     * taxId
     */
    @JsonProperty("tax_id")
    private String taxId;
    /**
     * logoUrl
     */
    @JsonProperty("logo_url")
    private String logoUrl;
    /**
     * additionalNotes
     */
    @JsonProperty("additional_notes")
    private String additionalNotes;
}
