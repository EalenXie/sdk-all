package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/29 15:51
 */
@Getter
@Setter
public class Rates {
    /**
     * rate
     */
    @JsonProperty("rate")
    private String rate;
    /**
     * countryCode
     */
    @JsonProperty("countryCode")
    private String countryCode;
}
