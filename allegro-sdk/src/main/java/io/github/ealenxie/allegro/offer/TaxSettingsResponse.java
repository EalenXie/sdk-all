package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/5 12:45
 */
@NoArgsConstructor
@Data
public class TaxSettingsResponse {


    /**
     * settings
     */
    @JsonProperty("settings")
    private List<TaxSetting> settings;
}
