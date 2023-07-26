package io.github.ealenxie.paypal.webhooks;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


/**
 * @author lanzhi
 * Created on 2023/7/20 10:48
 */
@Getter
@Setter
public class WebhookSignaturePayload {

    /**
     * The algorithm that PayPal uses to generate the signature and that you can use to verify the signature.
     * Extract this value from the PAYPAL-AUTH-ALGO response header, which is received with the webhook notification.
     */
    @JsonProperty("auth_algo")
    private String authAlgo;
    /**
     * The X.509 public key certificate. Download the certificate from this URL and use it to verify the signature.
     * Extract this value from the PAYPAL-CERT-URL response header, which is received with the webhook notification.
     */
    @JsonProperty("cert_url")
    private String certUrl;
    /**
     * The ID of the HTTP transmission.
     * Contained in the PAYPAL-TRANSMISSION-ID header of the notification message.
     */
    @JsonProperty("transmission_id")
    private String transmissionId;
    /**
     * The PayPal-generated asymmetric signature.
     * Appears in the PAYPAL-TRANSMISSION-SIG header of the notification message.
     */
    @JsonProperty("transmission_sig")
    private String transmissionSig;
    /**
     * The date and time of the HTTP transmission, in Internet date and time format.
     * Appears in the PAYPAL-TRANSMISSION-TIME header of the notification message.
     */
    @JsonProperty("transmission_time")
    private String transmissionTime;
    /**
     * The ID of the webhook as configured in your Developer Portal account.
     */
    @JsonProperty("webhook_id")
    private String webhookId;
    /**
     * A webhook event notification.
     */
    @JsonProperty("webhook_event")
    private WebhookEvent webhookEvent;
}

