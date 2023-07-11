package io.github.ealenxie.walmart.marketplace.settings;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/11 13:59
 */
@NoArgsConstructor
@Data
public class ShippingTemplateMethod {
    /**
     * shipMethod
     */
    @JsonProperty("shipMethod")
    private String shipMethod;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * configurations
     */
    @JsonProperty("configurations")
    private List<Configuration> configurations;
}
