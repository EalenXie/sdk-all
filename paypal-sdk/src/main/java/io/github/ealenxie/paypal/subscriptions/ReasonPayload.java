package io.github.ealenxie.paypal.subscriptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/26 15:20
 * @version 1.0
 */
@Getter
@Setter
public class ReasonPayload {
    /**
     * reason
     */
    @JsonProperty("reason")
    private String reason;
}
