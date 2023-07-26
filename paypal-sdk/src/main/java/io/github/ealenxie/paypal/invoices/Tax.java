package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/20 16:15
 */
@Getter
@Setter
public class Tax {
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * percent
     */
    @JsonProperty("percent")
    private String percent;
}
