package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/29 15:51
 */
@Getter
@Setter
public class TaxSettings {
    /**
     * rates
     */
    @JsonProperty("rates")
    private List<Rates> rates;
    /**
     * subject
     */
    @JsonProperty("subject")
    private String subject;
    /**
     * exemption
     */
    @JsonProperty("exemption")
    private String exemption;
}
