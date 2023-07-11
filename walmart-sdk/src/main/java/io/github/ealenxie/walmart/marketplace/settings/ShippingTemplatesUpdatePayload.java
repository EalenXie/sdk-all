package io.github.ealenxie.walmart.marketplace.settings;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/11 11:22
 */
@Getter
@Setter
public class ShippingTemplatesUpdatePayload {
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * type
     */
    @JsonProperty("type")
    private String type;
    /**
     * rateModelType
     */
    @JsonProperty("rateModelType")
    private String rateModelType;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * shippingMethods
     */
    @JsonProperty("shippingMethods")
    private List<ShippingMethod> shippingMethods;

}
