package io.github.ealenxie.paypal.invoices;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/24 10:51
 */
@Getter
@Setter
public class TemplateItemSetting {
    /**
     * fieldName
     */
    @JsonProperty("field_name")
    private String fieldName;
    /**
     * displayPreference
     */
    @JsonProperty("display_preference")
    private DisplayPreference displayPreference;
}
