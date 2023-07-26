package io.github.ealenxie.paypal.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/24 15:27
 */
@Getter
@Setter
public class ExperienceContext {
    /**
     * paymentMethodPreference
     */
    @JsonProperty("payment_method_preference")
    private String paymentMethodPreference;
    /**
     * paymentMethodSelected
     */
    @JsonProperty("payment_method_selected")
    private String paymentMethodSelected;
    /**
     * brandName
     */
    @JsonProperty("brand_name")
    private String brandName;
    /**
     * locale
     */
    @JsonProperty("locale")
    private String locale;
    /**
     * landingPage
     */
    @JsonProperty("landing_page")
    private String landingPage;
    /**
     * shippingPreference
     */
    @JsonProperty("shipping_preference")
    private String shippingPreference;
    /**
     * userAction
     */
    @JsonProperty("user_action")
    private String userAction;
    /**
     * returnUrl
     */
    @JsonProperty("return_url")
    private String returnUrl;
    /**
     * cancelUrl
     */
    @JsonProperty("cancel_url")
    private String cancelUrl;
}
