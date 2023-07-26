package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/24 11:19
 */
@Getter
@Setter
public class TemplateUpdatePayload {
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
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
}
