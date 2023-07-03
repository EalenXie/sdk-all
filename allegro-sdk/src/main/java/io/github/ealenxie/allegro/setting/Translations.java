package io.github.ealenxie.allegro.setting;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/3 16:30
 * @version 1.0
 */
@Getter
@Setter
public class Translations {
    /**
     * language
     */
    @JsonProperty("language")
    private String language;
    /**
     * additionalServices
     */
    @JsonProperty("additionalServices")
    private AdditionalServices additionalServices;
}
