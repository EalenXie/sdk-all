package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/24 11:05
 */
@Getter
@Setter
public class CreateTemplatePayload {


    /**
     * defaultTemplate
     */
    @JsonProperty("default_template")
    private Boolean defaultTemplate;
    /**
     * templateInfo
     */
    @JsonProperty("template_info")
    private TemplateInfo templateInfo;
    /**
     * settings
     */
    @JsonProperty("settings")
    private TemplateSettings settings;
    /**
     * unitOfMeasure
     */
    @JsonProperty("unit_of_measure")
    private String unitOfMeasure;
    /**
     * standardTemplate
     */
    @JsonProperty("standard_template")
    private Boolean standardTemplate;
}
