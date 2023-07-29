package io.github.ealenxie.paypal.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/29 10:03
 */
@Getter
@Setter
public class AuthorizationsResponse {
    /**
     * authorizations
     */
    @JsonProperty("authorizations")
    private List<Authorizations> authorizations;
}
