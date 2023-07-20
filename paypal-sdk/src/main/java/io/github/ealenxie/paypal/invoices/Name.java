package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/20 16:15
 */
@NoArgsConstructor
@Data
public class Name {
    /**
     * givenName
     */
    @JsonProperty("given_name")
    private String givenName;
    /**
     * surname
     */
    @JsonProperty("surname")
    private String surname;
}
