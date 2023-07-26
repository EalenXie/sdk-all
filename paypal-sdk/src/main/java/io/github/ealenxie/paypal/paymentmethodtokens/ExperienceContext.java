package io.github.ealenxie.paypal.paymentmethodtokens;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/26 16:44
 * @version 1.0
 */
@Getter
@Setter
public class ExperienceContext {
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
