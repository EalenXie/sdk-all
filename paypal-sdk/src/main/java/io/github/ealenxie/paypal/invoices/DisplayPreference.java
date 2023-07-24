package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/24 10:51
 */
@Getter
@Setter
public class DisplayPreference {
    /**
     * hidden
     */
    @JsonProperty("hidden")
    private Boolean hidden;
}
