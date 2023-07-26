package io.github.ealenxie.paypal.webhooks;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/7/20 13:21
 **/
@Getter
@Setter
public class WebhookSignatureResponse {
    /**
     * The status of the signature verification.
     * Enum: "SUCCESS" "FAILURE"
     */
    @JsonProperty("verification_status")
    private String verificationStatus;
}

