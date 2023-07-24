package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/24 10:51
 */
@Getter
@Setter
public class TemplatesResponse {

    /**
     * addresses
     */
    @JsonProperty("addresses")
    private List<Address> addresses;
    /**
     * emails
     */
    @JsonProperty("emails")
    private String emails;
    /**
     * phones
     */
    @JsonProperty("phones")
    private List<Phone> phones;
    /**
     * templates
     */
    @JsonProperty("templates")
    private List<Template> templates;
}
