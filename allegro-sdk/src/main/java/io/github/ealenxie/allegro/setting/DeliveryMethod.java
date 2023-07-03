package io.github.ealenxie.allegro.setting;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/3 15:23
 * @version 1.0
 */
@Getter
@Setter
public class DeliveryMethod {
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
     * marketplaces
     */
    @JsonProperty("marketplaces")
    private List<String> marketplaces;
    /**
     * paymentPolicy
     */
    @JsonProperty("paymentPolicy")
    private String paymentPolicy;
    /**
     * allegroEndorsed
     */
    @JsonProperty("allegroEndorsed")
    private Boolean allegroEndorsed;
    /**
     * shippingRatesConstraints
     */
    @JsonProperty("shippingRatesConstraints")
    private ShippingRatesConstraints shippingRatesConstraints;
}
