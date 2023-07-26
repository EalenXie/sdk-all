package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Link;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/24 10:51
 */
@Getter
@Setter
public class Template {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
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
    /**
     * standardTemplate
     */
    @JsonProperty("standard_template")
    private Boolean standardTemplate;
    /**
     * links
     */
    @JsonProperty("links")
    private List<Link> links;
}
