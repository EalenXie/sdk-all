package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class Marketplace {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * languages
     */
    @JsonProperty("languages")
    private Languages languages;
    /**
     * currencies
     */
    @JsonProperty("currencies")
    private Currencies currencies;
    /**
     * shippingCountries
     */
    @JsonProperty("shippingCountries")
    private List<OfferCreation> shippingCountries;
}
