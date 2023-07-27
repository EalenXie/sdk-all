package io.github.ealenxie.paypal.payouts;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/7/26 16:41
 **/
@Getter
@Setter
public class AlternateNotificationMethod {
    /**
     * The mobile phone number of the receiver.
     */
    @JsonProperty("phone")
    private Phone phone;
}

