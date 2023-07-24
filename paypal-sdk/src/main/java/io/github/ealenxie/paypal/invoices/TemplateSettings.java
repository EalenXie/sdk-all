package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/24 10:51
 */
@Getter
@Setter
public class TemplateSettings {
    /**
     * templateItemSettings
     */
    @JsonProperty("template_item_settings")
    private List<TemplateItemSetting> templateItemSettings;
    /**
     * templateSubtotalSettings
     */
    @JsonProperty("template_subtotal_settings")
    private List<TemplateSubtotalSetting> templateSubtotalSettings;
}
