package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/5 12:45
 */
@Getter
@Setter
public class TaxSettingsResponse {


    /**
     * settings
     */
    @JsonProperty("settings")
    private List<TaxSetting> settings;
}
