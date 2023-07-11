package io.github.ealenxie.walmart.marketplace.settings;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/11 14:05
 */
@NoArgsConstructor
@Data
public class ShippingTemplateCreateResponse {

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
