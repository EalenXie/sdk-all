package io.github.ealenxie.paypal.disputes;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/18 13:55
 */
@NoArgsConstructor
@Data
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
