package io.github.ealenxie.paypal.subscriptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Money;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/26 15:28
 * @version 1.0
 */
@Getter
@Setter
public class CaptureSubscriptionPayload {

    /**
     * note
     */
    @JsonProperty("note")
    private String note;
    /**
     * captureType
     */
    @JsonProperty("capture_type")
    private String captureType;
    /**
     * amount
     */
    @JsonProperty("amount")
    private Money amount;
}
