package io.github.ealenxie.paypal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.MediaType;

/**
 * @author EalenXie created on 2023/7/29 10:48
 * <a href="https://developer.paypal.com/api/rest/requests/">https://developer.paypal.com/api/rest/requests/</a>
 */
@Getter
@Setter
public class PayPalHeaders {
    @JsonIgnore
    private String accessToken;
    @JsonIgnore
    private MediaType mediaType = MediaType.APPLICATION_JSON;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("PayPal-Request-Id")
    private String payPalRequestId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("PayPal-Auth-Assertion")
    private String payPalAuthAssertion;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("PayPal-Partner-Attribution-Id")
    private String payPalPartnerAttributionId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("PayPal-Client-Metadata-Id")
    private String payPalClientMetadataId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("Prefer")
    private String prefer;
}
