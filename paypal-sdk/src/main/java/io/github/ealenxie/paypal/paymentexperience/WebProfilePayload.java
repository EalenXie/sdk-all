package io.github.ealenxie.paypal.paymentexperience;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/29 11:37
 */
@NoArgsConstructor
@Data
public class WebProfilePayload {

    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * presentation
     */
    @JsonProperty("presentation")
    private Presentation presentation;
    /**
     * inputFields
     */
    @JsonProperty("input_fields")
    private InputFields inputFields;
    /**
     * flowConfig
     */
    @JsonProperty("flow_config")
    private FlowConfigPayload flowConfig;
}
