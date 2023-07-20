package io.github.ealenxie.paypal.disputes;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/18 13:55
 */
@Getter
@Setter
public class Seller {
    /**
     * email
     */
    @JsonProperty("email")
    private String email;
    /**
     * merchantId
     */
    @JsonProperty("merchant_id")
    private String merchantId;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
}
