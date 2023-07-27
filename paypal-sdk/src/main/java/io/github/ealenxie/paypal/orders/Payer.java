package io.github.ealenxie.paypal.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/24 15:33
 */
@Getter
@Setter
public class Payer {
    /**
     * name
     */
    @JsonProperty("name")
    private Name name;
    /**
     * emailAddress
     */
    @JsonProperty("email_address")
    private String emailAddress;
    /**
     * payerId
     */
    @JsonProperty("payer_id")
    private String payerId;
}
