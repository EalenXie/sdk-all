package io.github.ealenxie.paypal.subscriptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/26 14:24
 * @version 1.0
 */
@Getter
@Setter
public class UpdateSubscriptionPayload {

    /**
     * op
     */
    @JsonProperty("op")
    private String op;
    /**
     * path
     */
    @JsonProperty("path")
    private String path;
    /**
     * value
     */
    @JsonProperty("value")
    private Money value;
}
