package io.github.ealenxie.walmart.marketplace.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/10 11:23
 */
@Getter
@Setter
public class Contact {
    /**
     * name
     */
    @JsonProperty("name")
    private Name name;
    /**
     * phone
     */
    @JsonProperty("phone")
    private String phone;
    /**
     * email
     */
    @JsonProperty("email")
    private String email;
}
