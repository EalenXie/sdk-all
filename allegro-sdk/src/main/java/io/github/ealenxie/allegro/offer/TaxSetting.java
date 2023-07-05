package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/5 12:48
 */
@NoArgsConstructor
@Data
public class TaxSetting {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * rate
     */
    @JsonProperty("rate")
    private IdNamePayload rate;
    /**
     * percentage
     */
    @JsonProperty("percentage")
    private String percentage;
    /**
     * subject
     */
    @JsonProperty("subject")
    private IdNamePayload subject;
    /**
     * exemption
     */
    @JsonProperty("exemption")
    private IdNamePayload exemption;
    /**
     * countryCode
     */
    @JsonProperty("countryCode")
    private String countryCode;
}
