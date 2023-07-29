package io.github.ealenxie.paypal.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/29 9:57
 */
@Getter
@Setter
public class Paypal {
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
     * experienceContext
     */
    @JsonProperty("experience_context")
    private ExperienceContext experienceContext;
}
