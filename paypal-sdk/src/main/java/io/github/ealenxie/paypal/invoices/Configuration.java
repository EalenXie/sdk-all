package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/20 16:15
 */
@Getter
@Setter
public class Configuration {
    /**
     * partialPayment
     */
    @JsonProperty("partial_payment")
    private PartialPayment partialPayment;
    /**
     * allowTip
     */
    @JsonProperty("allow_tip")
    private Boolean allowTip;
    /**
     * taxCalculatedAfterDiscount
     */
    @JsonProperty("tax_calculated_after_discount")
    private Boolean taxCalculatedAfterDiscount;
    /**
     * taxInclusive
     */
    @JsonProperty("tax_inclusive")
    private Boolean taxInclusive;
    /**
     * templateId
     */
    @JsonProperty("template_id")
    private String templateId;
}
